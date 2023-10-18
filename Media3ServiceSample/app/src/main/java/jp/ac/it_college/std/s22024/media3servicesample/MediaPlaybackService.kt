package jp.ac.it_college.std.s22024.media3servicesample

import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.session.MediaSession
import androidx.media3.session.MediaSessionService

class MediaPlaybackService : MediaSessionService() {

    private var mediaSession: MediaSession? = null
    override fun onGetSession(controllerInfo: MediaSession.ControllerInfo): MediaSession? =
        mediaSession

    private val playerListener = object : Player.Listener {
        override fun onPlaybackStateChanged(playbackState: Int) {
            when (playbackState) {
                Player.STATE_ENDED -> this@MediaPlaybackService.stopSelf()
                // バッファリング中(開始？)
                Player.STATE_BUFFERING -> {}
                // アイドル(待機)状態
                Player.STATE_IDLE -> {}
                // 再生準備完了
                Player.STATE_READY -> {}
            }
        }
    }

    override fun onCreate() {
        super.onCreate()

        val player = ExoPlayer.Builder(this).build()

        player.addListener(playerListener)

        mediaSession = MediaSession.Builder(this, player).build()
    }

    override fun onDestroy() {
        mediaSession?.run {
            player.release()

            release()
        }
        mediaSession = null
        super.onDestroy()
    }
}