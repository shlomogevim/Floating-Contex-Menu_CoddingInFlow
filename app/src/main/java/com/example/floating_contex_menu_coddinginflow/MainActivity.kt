package com.example.floating_contex_menu_coddinginflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerForContextMenu(text_view)   //Long Press Only !!!!!!
    }

       override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)

           menu?.setHeaderTitle("Choose your option")
          menuInflater.inflate(R.menu.menu_example, menu)
        //can use another v (iew) and create seperat menus with when
    }

    override fun onContextItemSelected(item: MenuItem?): Boolean {
        when (item?.getItemId()) {
            R.id.option_1 -> {
                Toast.makeText(this, "Item 1 clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.option_2 -> {
                Toast.makeText(this, "Item 2 clicked", Toast.LENGTH_SHORT).show()
                return true
            }
            else -> return super.onContextItemSelected(item)
        }
    }
}

