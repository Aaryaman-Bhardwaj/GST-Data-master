package com.aaryaman.gstdatamaster.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.navigation.Navigation
import com.aaryaman.gstdatamaster.R


class CalculateFragment : Fragment() {
    lateinit var downloadBtn:Button
    lateinit var calculateBtn:Button
    lateinit var preview: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_calculate, container, false)

        calculateBtn=view.findViewById<Button>(R.id.calculateButton)
        downloadBtn=view.findViewById(R.id.downloadButton)
        preview=view.findViewById(R.id.previewCalculate)

        calculateBtn.setOnClickListener {

        }

        preview.setOnClickListener {
            val intent= Intent(Intent.ACTION_VIEW)
            intent.data = Data.fileLocation
            startActivity(intent)
        }

        return view
    }


}