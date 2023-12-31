package jp.ac.it_college.std.s22024.navigation_sample.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import jp.ac.it_college.std.s22024.navigation_sample.R
import jp.ac.it_college.std.s22024.navigation_sample.databinding.FragmentHomeBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.homeToNext.setOnClickListener{ toNext() }
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

    private fun toNext() {
        val action = HomeFragmentDirections.actionHomeFragmentToSecondFragment()
        findNavController().navigate(action)
    }
}