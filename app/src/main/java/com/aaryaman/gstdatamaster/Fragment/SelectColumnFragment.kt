package com.aaryaman.gstdatamaster.Fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.aaryaman.gstdatamaster.SpinnerData.DataExcel
import com.aaryaman.gstdatamaster.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SelectColumnFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SelectColumnFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_select_column, container, false)

        val autoCompleteTextView1=view.findViewById<Spinner>(R.id.autoCompleteTextView1)
        val autoCompleteTextView2=view.findViewById<Spinner>(R.id.autoCompleteTextView2)
        val autoCompleteTextView3=view.findViewById<Spinner>(R.id.autoCompleteTextView3)
        val autoCompleteTextView4=view.findViewById<Spinner>(R.id.autoCompleteTextView4)
        val autoCompleteTextView5=view.findViewById<Spinner>(R.id.autoCompleteTextView5)
        val autoCompleteTextView6=view.findViewById<Spinner>(R.id.autoCompleteTextView6)
        val autoCompleteTextView7=view.findViewById<Spinner>(R.id.autoCompleteTextView7)
        val autoCompleteTextView8=view.findViewById<Spinner>(R.id.autoCompleteTextView8)

        Log.d("Hashmap","Hello before Adapter")
        val arrayAdapter= ArrayAdapter(
            requireContext(),
            R.layout.dropdown_item,
            DataExcel.ColumnName
        )
        arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)
        autoCompleteTextView1.adapter = arrayAdapter
        autoCompleteTextView2.adapter = arrayAdapter
        autoCompleteTextView3.adapter = arrayAdapter
        autoCompleteTextView4.adapter = arrayAdapter
        autoCompleteTextView5.adapter = arrayAdapter
        autoCompleteTextView6.adapter = arrayAdapter
        autoCompleteTextView7.adapter = arrayAdapter
        autoCompleteTextView8.adapter = arrayAdapter

        Log.d("Hashmap","Hello after Adapter")


        autoCompleteTextView1.onItemSelectedListener= object :AdapterView.OnItemSelectedListener
        {   override fun onItemSelected(parent: AdapterView<*>?,view: View?, position: Int, id: Long) {
                DataExcel.hashMap[0]=position
            Log.d("Hashmap"," ${DataExcel.SelectName[0]} ${DataExcel.hashMap[0]}")
            }
            override fun onNothingSelected(parent: AdapterView<*>?) {
             }

        }
        autoCompleteTextView2.onItemSelectedListener= object :AdapterView.OnItemSelectedListener
        {   override fun onItemSelected(parent: AdapterView<*>?,view: View?, position: Int, id: Long) {
            DataExcel.hashMap[1]=position
            Log.d("Hashmap"," ${DataExcel.SelectName[1]} ${DataExcel.hashMap[1]}")
        }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

        }
        autoCompleteTextView3.onItemSelectedListener= object :AdapterView.OnItemSelectedListener
        {   override fun onItemSelected(parent: AdapterView<*>?,view: View?, position: Int, id: Long) {
            DataExcel.hashMap[2]=position
            Log.d("Hashmap"," ${DataExcel.SelectName[2]} ${DataExcel.hashMap[2]}")
        }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

        }
        autoCompleteTextView4.onItemSelectedListener= object :AdapterView.OnItemSelectedListener
        {   override fun onItemSelected(parent: AdapterView<*>?,view: View?, position: Int, id: Long) {
            DataExcel.hashMap[3]=position
            Log.d("Hashmap"," ${DataExcel.SelectName[3]} ${DataExcel.hashMap[3]}")
        }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

        }
        autoCompleteTextView5.onItemSelectedListener= object :AdapterView.OnItemSelectedListener
        {   override fun onItemSelected(parent: AdapterView<*>?,view: View?, position: Int, id: Long) {
            DataExcel.hashMap[4]=position
            Log.d("Hashmap"," ${DataExcel.SelectName[4]} ${DataExcel.hashMap[4]}")
        }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

        }
        autoCompleteTextView6.onItemSelectedListener= object :AdapterView.OnItemSelectedListener
        {   override fun onItemSelected(parent: AdapterView<*>?,view: View?, position: Int, id: Long) {
            DataExcel.hashMap[5]=position
            Log.d("Hashmap"," ${DataExcel.SelectName[5]} ${DataExcel.hashMap[5]}")
        }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

        }
        autoCompleteTextView7.onItemSelectedListener= object :AdapterView.OnItemSelectedListener
        {   override fun onItemSelected(parent: AdapterView<*>?,view: View?, position: Int, id: Long) {
            DataExcel.hashMap[6]=position
            Log.d("Hashmap"," ${DataExcel.SelectName[6]} ${DataExcel.hashMap[6]}")
        }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

        }
        autoCompleteTextView8.onItemSelectedListener= object :AdapterView.OnItemSelectedListener
        {   override fun onItemSelected(parent: AdapterView<*>?,view: View?, position: Int, id: Long) {
            DataExcel.hashMap[7]=position
            Log.d("Hashmap"," ${DataExcel.SelectName[7]} ${DataExcel.hashMap[7]}")
        }
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

        }

            
        return view
    }


}