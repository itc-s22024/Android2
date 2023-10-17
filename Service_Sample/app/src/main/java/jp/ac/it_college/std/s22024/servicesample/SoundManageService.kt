package jp.ac.it_college.std.s22024.servicesample

import android.app.NotificationManager
import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.IBinder

private const val CHANEL_ID = "sound_manager_service_notification_chanel"
class SoundManageService : Service() {
    private var mediaPlayer: MediaPlayer? = null

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onCreate() {
        super.onCreate()

        mediaPlayer = MediaPlayer()

        val name = getString(R.string.notification_channel_name)
        val importance = NotificationManager.IMPORTANCE_DEFAULT
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val mediaFileUri = Uri.parse(
            "android.resource://${packageName}/${R.raw.semi}"
        )
        mediaPlayer?.run {
            setDataSource(this@SoundManageService, mediaFileUri)
            setOnPreparedListener { onMediaPlayerPrepared() }
            setOnCompletionListener { onPlaybackEnd() }
            prepareAsync()
        }
        return START_NOT_STICKY
    }


        override fun onDestroy() {
            mediaPlayer?.run {
                if (isPlaying) {
                    stop()
                }
            }
            super.onDestroy()
        }

        private fun onMediaPlayerPrepared() {
            mediaPlayer?.start()
        }

        private fun onPlaybackEnd() {
            stopSelf()
        }
    }
