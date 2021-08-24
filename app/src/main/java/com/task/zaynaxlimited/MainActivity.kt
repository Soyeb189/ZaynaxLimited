package com.task.zaynaxlimited

import android.graphics.Paint
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView
import androidx.core.view.MenuCompat
import androidx.core.view.ViewCompat
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.nex3z.notificationbadge.NotificationBadge


class MainActivity : AppCompatActivity() {

    private lateinit var toolbar: Toolbar
    private lateinit var toolbar2: RelativeLayout

    private lateinit var appBarLayout: AppBarLayout
    private lateinit var collapsingToolbarLayout: CollapsingToolbarLayout

    private lateinit var tvPreviousPrice: TextView

    //*********** Size Cards **************//
    private lateinit var sizeCardOne: CardView
    private lateinit var sizeCardTwo: CardView
    private lateinit var sizeCardThree: CardView
    private lateinit var sizeCardFour: CardView
    private lateinit var sizeCardFive: CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initialization()

        val badge = findViewById<NotificationBadge>(R.id.badge)

        badge.setNumber(2)


        //********   Toolbar  start ******************//

        setSupportActionBar(toolbar)
        supportActionBar!!.title = ""
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setHomeAsUpIndicator(R.drawable.ic_baseline_arrow_back_ios_black)

        //********   Toolbar  end ******************//

        tvPreviousPrice.paintFlags = tvPreviousPrice.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG

        //*********** Set click Listner for Size card start *************//

        sizeCardOne.setOnClickListener {
            showBottomSheet()
        }

        sizeCardTwo.setOnClickListener {
            showBottomSheet()
        }

        sizeCardThree.setOnClickListener {
            showBottomSheet()
        }

        sizeCardFour.setOnClickListener {
            showBottomSheet()
        }

        sizeCardFive.setOnClickListener {
            showBottomSheet()
        }

        //*********** Set click Listner for Size card end *************//





        appBarLayout.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener
        { appBarLayout, verticalOffset ->
            if (collapsingToolbarLayout.height + verticalOffset < 2 * ViewCompat.getMinimumHeight(
                    collapsingToolbarLayout
                )
            ) {
                toolbar.visibility = View.VISIBLE
                toolbar2.visibility = View.GONE
            } else {
                toolbar.visibility = View.GONE
                toolbar2.visibility = View.VISIBLE
            }
        })

    }

    //********** Function to Show Bottom Sheet

    private fun showBottomSheet() {
        var bottomStheet = BottomSheet()
        bottomStheet.show(supportFragmentManager, "TAG")
    }

    private fun initialization() {
        //********** Toolbar *************//
        toolbar = findViewById(R.id.toolbar)
        toolbar2 = findViewById(R.id.toolbarTwo)

        //****** App Bar Layout
        appBarLayout = findViewById(R.id.appBarLayout)
        collapsingToolbarLayout = findViewById(R.id.collapsingToolbar)


        //******* Price Tag *****//
        tvPreviousPrice = findViewById(R.id.tvPreviousPrice)

        //***   Size Card *****//
        sizeCardOne = findViewById(R.id.sizeCardOne)
        sizeCardTwo = findViewById(R.id.sizeCardTwo)
        sizeCardThree = findViewById(R.id.sizeCardThree)
        sizeCardFour = findViewById(R.id.sizeCardFour)
        sizeCardFive = findViewById(R.id.sizeCardFive)
    }


    /*****************Menu Start******************/
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_toolbar, menu)
        MenuCompat.setGroupDividerEnabled(menu, true)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.balance -> {
            }
        }
        return super.onOptionsItemSelected(item)
    }
    /*****************Menu End******************/

}