package com.xanthron.keralamarry.Fragments

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.xanthron.keralamarry.R
import kotlinx.android.synthetic.main.fragment_match.view.*
import kotlinx.android.synthetic.main.fragment_matchtest.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MatchFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MatchFragmentTest : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)

        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val contextThemeWrapper: Context = ContextThemeWrapper(
            activity,
            R.style.Theme_AppCompat_Light_NoActionBar
        )
        val localInflater = inflater.cloneInContext(contextThemeWrapper)
        val view = localInflater.inflate(R.layout.fragment_matchtest, container, false)
        view.matslider.setOnTouchListener(View.OnTouchListener { view, motionEvent -> true })
        //short list button
        view.match_btn_short_list.setOnClickListener {
            view.match_btn_short_list.background =
                match_btn_short_list.context.resources.getDrawable(R.drawable.profile_card_click);


            val handler = Handler()
            handler.postDelayed({
                view.match_btn_short_list.background = match_btn_short_list.context.resources.getDrawable(
                    R.drawable.profile_card
                );
            }, 100)


        }

        //send interest button
        view.match_btn_send_intrest.setOnClickListener {
            view.match_btn_send_intrest.background =
                match_btn_send_intrest.context.resources.getDrawable(R.drawable.profile_card_click);


            val handler = Handler()
            handler.postDelayed({
                view.match_btn_send_intrest.background =
                    match_btn_send_intrest.context.resources.getDrawable(
                        R.drawable.profile_card
                    );
            }, 100)


        }

        //chat button
        view.match_btn_chat.setOnClickListener {
            view.match_btn_chat.background =
                match_btn_chat.context.resources.getDrawable(R.drawable.profile_card_click);

            val handler = Handler()
            handler.postDelayed({
                view.match_btn_chat.background = match_btn_chat.context.resources.getDrawable(
                    R.drawable.profile_card
                );
            }, 100)
        }

        return view

    }

    companion object {

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment MatchFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MatchFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}