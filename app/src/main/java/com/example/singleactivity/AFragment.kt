package com.example.singleactivity


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavDirections
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.custom_view.view.*
import kotlinx.android.synthetic.main.fragment_a.*


class AFragment : Fragment() {

    val data = arrayOf("a", "b", "c")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Enable buttons in App Bar aka Action Bar, when managed from a Fragment (override onCreateOptionsMenu and onOptionsItemSelected)!!!
        setHasOptionsMenu(true)
        (activity as AppCompatActivity).supportActionBar!!.title = "Fragment A"


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view1.editText.setText(data[0])
        view2.editText.setText(data[1])
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.fragment_a_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val menuItemClicked = item.itemId

        if (menuItemClicked == R.id.action_next){

            this.navigateToFragmentB()

            return true
        }

        return super.onOptionsItemSelected(item)
    }

    private fun navigateToFragmentB() {

        val action: NavDirections = AFragmentDirections.actionAFragmentToBFragment()
        findNavController().navigate(action)
    }

}
