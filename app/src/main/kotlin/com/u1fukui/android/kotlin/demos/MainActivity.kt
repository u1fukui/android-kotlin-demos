package com.u1fukui.android.kotlin.demos

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = DemoItemListAdapter(this, createDemoList())
        val listView = findViewById(R.id.list) as ListView
        listView.adapter = adapter
        listView.setOnItemClickListener { parent, view, pos, id ->
            val item = adapter.getItem(pos)
            startActivity(Intent(this, item.activityClass))
        }
    }

    private fun createDemoList() : List<DemoItem> {
        return arrayListOf(
                DemoItem(QiitaClientActivity::class.java, "QiitaClient")
        )
    }
}
