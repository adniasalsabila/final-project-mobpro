package org.d3if4133.side_project_adnia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var layoutManager: RecyclerView.LayoutManager? = null
    var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null
    var adapter2: RecyclerView.Adapter<RecycleAdapterReq.ViewHolder>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)


            layoutManager = LinearLayoutManager(this)
            recycler_view.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL ,false)
            recycler_view_req.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL ,false)

            adapter = RecyclerAdapter()
            recycler_view.adapter = adapter

            adapter2 = RecycleAdapterReq()
            recycler_view_req.adapter = adapter2


    }
}
