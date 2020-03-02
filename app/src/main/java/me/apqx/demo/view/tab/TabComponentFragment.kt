package me.apqx.demo.view.tab

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.frag_component.*
import me.apqx.demo.MainActivity
import me.apqx.demo.R
import me.apqx.demo.mvp.BaseFragment
import me.apqx.demo.mvp.BasePresenter
import me.apqx.demo.mvp.IBaseView
import me.apqx.demo.view.HomeFragmentDirections

class TabComponentFragment: BaseFragment<BasePresenter<IBaseView>>() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.frag_component, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btn_recycler.setOnClickListener(this)
        btn_notification.setOnClickListener(this)
    }



    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_recycler -> {
                (activity as MainActivity).navController.navigate(HomeFragmentDirections.actionHomeToRecycler())
            }
            R.id.btn_notification -> {
                (activity as MainActivity).navController.navigate(HomeFragmentDirections.actionHomeToNotification())
            }
        }
    }
}