package com.xanthron.keralamarry.Fragments

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.view.ContextThemeWrapper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.xanthron.keralamarry.R
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
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
        // Inflate the layout for this fragment
        val view = localInflater.inflate(R.layout.fragment_home, container, false)

        //click on view all button
        view.bt_view_all.setOnClickListener {
            view.bt_view_all.background =
                bt_view_all.context.resources.getDrawable(R.drawable.profile_card_click);

            val handler = Handler()
            handler.postDelayed({
                view.bt_view_all.background = bt_view_all.context.resources.getDrawable(
                    R.drawable.profile_card
                );
            }, 100)
        }


        //click on near matches
        view.bt_nearmatch.setOnClickListener {
            view.bt_nearmatch.background =
                bt_nearmatch.context.resources.getDrawable(R.drawable.profile_card_click);

            val handler = Handler()
            handler.postDelayed({
                view.bt_nearmatch.background = bt_nearmatch.context.resources.getDrawable(
                    R.drawable.profile_card
                );
            }, 100)
        }


        //click on Make payment
        view.bt_makepayment.setOnClickListener {
            view.bt_makepayment.background =
                bt_makepayment.context.resources.getDrawable(R.drawable.profile_card_click);

            val handler = Handler()
            handler.postDelayed({
                view.bt_makepayment.background = bt_makepayment.context.resources.getDrawable(
                    R.drawable.profile_card
                );
            }, 100)
        }


        //click on interest recieved
        view.bt_interest_recived.setOnClickListener {
            view.bt_interest_recived.background =
                bt_interest_recived.context.resources.getDrawable(R.drawable.profile_card_click);

            val handler = Handler()
            handler.postDelayed({
                view.bt_interest_recived.background =
                    bt_interest_recived.context.resources.getDrawable(
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
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}