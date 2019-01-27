package com.ishaquehassan.recyclerviewgeneraladaptersample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.TextView
import com.ishaquehassan.recyclerviewgeneraladapter.RecyclerViewGeneralAdapter
import com.ishaquehassan.recyclerviewgeneraladapter.addListDivider
import kotlinx.android.synthetic.main.activity_simple_list.*

class SimpleListActivity : AppCompatActivity() {

    //Model class for each item
    private data class SimpleItemModel(val name:String,val releaseYear:String)

    //Declaring list for list to render
    private lateinit var simpleData:ArrayList<SimpleItemModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_list)

        //Initialized data list with sample data
        simpleData = arrayListOf(
            SimpleItemModel("The Shawshank Redemption","1994"),
            SimpleItemModel("The Godfather","1972"),
            SimpleItemModel("The Godfather: Part II","1974"),
            SimpleItemModel("The Dark Knight ","2008"),
            SimpleItemModel("12 Angry Men","1957"),
            SimpleItemModel("Schindler's List","1993"),
            SimpleItemModel("The Shawshank Redemption","1994"),
            SimpleItemModel("The Godfather","1972"),
            SimpleItemModel("The Godfather: Part II","1974"),
            SimpleItemModel("The Dark Knight ","2008"),
            SimpleItemModel("12 Angry Men","1957"),
            SimpleItemModel("Schindler's List","1993")
        )

        mySimpleList.layoutManager = LinearLayoutManager(this)

        //Added list divider in just a simple call to this method
        mySimpleList.addListDivider()

        //Here we can just create & set the adapter in few lines
        mySimpleList.adapter = RecyclerViewGeneralAdapter(
            simpleData,R.layout.simple_list_item
        ) {itemData, viewHolder ->
            val mainView = viewHolder.itemView
            val nameTv = mainView.findViewById<TextView>(R.id.simple_name_tv)
            val yearTv = mainView.findViewById<TextView>(R.id.simple_year_tv)

            nameTv.text = itemData.name
            yearTv.text = itemData.releaseYear
        }
    }
}
