package com.task.zaynaxlimited


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ViewFlipper
import androidx.cardview.widget.CardView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheet : BottomSheetDialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {

        var view = inflater.inflate(R.layout.fragment_bottom_stheet, container, false)
        var closeBtn = view.findViewById<ImageView>(R.id.closeBtn)

        var viewFlipper = view.findViewById<ViewFlipper>(R.id.viewFlipper)

        var leftArrow = view.findViewById<ImageView>(R.id.leftArrow)
        var rightArrow = view.findViewById<ImageView>(R.id.rightArrow)

        var xlSize = view.findViewById<LinearLayout>(R.id.xlSize)
        var xSize = view.findViewById<LinearLayout>(R.id.xSize)
        var mSize = view.findViewById<LinearLayout>(R.id.mSize)
        var sSize = view.findViewById<LinearLayout>(R.id.sSize)


        var colorOne = view.findViewById<LinearLayout>(R.id.colorOne)
        var colorTwo = view.findViewById<LinearLayout>(R.id.colorTwo)
        var colorThree = view.findViewById<LinearLayout>(R.id.colorThree)
        var colorFour = view.findViewById<LinearLayout>(R.id.colorFour)
        var colorFive = view.findViewById<LinearLayout>(R.id.colorFive)


        colorOne.setOnClickListener {
            colorOne.setBackgroundResource(R.drawable.custom_recktangle_box_green)
            colorTwo.setBackgroundResource(R.drawable.custom_rectangle_box_transparent)
            colorThree.setBackgroundResource(R.drawable.custom_rectangle_box_transparent)
            colorFour.setBackgroundResource(R.drawable.custom_rectangle_box_transparent)
            colorFive.setBackgroundResource(R.drawable.custom_rectangle_box_transparent)
        }

        colorTwo.setOnClickListener {
            colorOne.setBackgroundResource(R.drawable.custom_rectangle_box_transparent)
            colorTwo.setBackgroundResource(R.drawable.custom_recktangle_box_green)
            colorThree.setBackgroundResource(R.drawable.custom_rectangle_box_transparent)
            colorFour.setBackgroundResource(R.drawable.custom_rectangle_box_transparent)
            colorFive.setBackgroundResource(R.drawable.custom_rectangle_box_transparent)
        }

        colorThree.setOnClickListener {
            colorOne.setBackgroundResource(R.drawable.custom_rectangle_box_transparent)
            colorTwo.setBackgroundResource(R.drawable.custom_rectangle_box_transparent)
            colorThree.setBackgroundResource(R.drawable.custom_recktangle_box_green)
            colorFour.setBackgroundResource(R.drawable.custom_rectangle_box_transparent)
            colorFive.setBackgroundResource(R.drawable.custom_rectangle_box_transparent)
        }

        colorFour.setOnClickListener {
            colorOne.setBackgroundResource(R.drawable.custom_rectangle_box_transparent)
            colorTwo.setBackgroundResource(R.drawable.custom_rectangle_box_transparent)
            colorThree.setBackgroundResource(R.drawable.custom_rectangle_box_transparent)
            colorFour.setBackgroundResource(R.drawable.custom_recktangle_box_green)
            colorFive.setBackgroundResource(R.drawable.custom_rectangle_box_transparent)
        }

        colorFive.setOnClickListener {
            colorOne.setBackgroundResource(R.drawable.custom_rectangle_box_transparent)
            colorTwo.setBackgroundResource(R.drawable.custom_rectangle_box_transparent)
            colorThree.setBackgroundResource(R.drawable.custom_rectangle_box_transparent)
            colorFour.setBackgroundResource(R.drawable.custom_rectangle_box_transparent)
            colorFive.setBackgroundResource(R.drawable.custom_recktangle_box_green)
        }




        xlSize.setOnClickListener {
            xlSize.setBackgroundResource(R.drawable.custom_recktangle_box_green)
            xSize.setBackgroundResource(R.drawable.custom_rectangle_box)
            mSize.setBackgroundResource(R.drawable.custom_rectangle_box)
            sSize.setBackgroundResource(R.drawable.custom_rectangle_box)
        }

        xSize.setOnClickListener {
            xlSize.setBackgroundResource(R.drawable.custom_rectangle_box)
            xSize.setBackgroundResource(R.drawable.custom_recktangle_box_green)
            mSize.setBackgroundResource(R.drawable.custom_rectangle_box)
            sSize.setBackgroundResource(R.drawable.custom_rectangle_box)
        }

        mSize.setOnClickListener {
            xlSize.setBackgroundResource(R.drawable.custom_rectangle_box)
            xSize.setBackgroundResource(R.drawable.custom_rectangle_box)
            mSize.setBackgroundResource(R.drawable.custom_recktangle_box_green)
            sSize.setBackgroundResource(R.drawable.custom_rectangle_box)
        }

        sSize.setOnClickListener {
            xlSize.setBackgroundResource(R.drawable.custom_rectangle_box)
            xSize.setBackgroundResource(R.drawable.custom_rectangle_box)
            mSize.setBackgroundResource(R.drawable.custom_rectangle_box)
            sSize.setBackgroundResource(R.drawable.custom_recktangle_box_green)
        }

        leftArrow.visibility = View.INVISIBLE

        rightArrow.setOnClickListener {
            leftArrow.visibility = View.VISIBLE
            rightArrow.visibility = View.INVISIBLE
            viewFlipper.showNext()
        }

        leftArrow.setOnClickListener {
            leftArrow.visibility = View.INVISIBLE
            rightArrow.visibility = View.VISIBLE
            viewFlipper.showPrevious()
        }

        closeBtn.setOnClickListener {
            dialog?.dismiss()
        }
        return view
    }

}