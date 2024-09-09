package se.gritacademy.navigatortest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  supportFragmentManager.beginTransaction().add(R.id.fragmentContainerView, BlankFragment()).addToBackStack("frag1").commit()
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        findViewById<Button>(R.id.button).setOnClickListener {
            Log.i("alrik", "onCreate: "+navController.currentDestination!!.toString())

            Log.i("alrik", "onCreate: "+navController.currentDestination!!.toString()+navController.currentDestination!!.id)
            if(navController.currentDestination!!.id == R.id.blankFragment2)
                navController.navigate(R.id.action_blankFragment2_to_blankFragment)
            else
                navController.navigate(R.id.action_blankFragment_to_blankFragment2)



        }

        //view.findNavController().navigate(R.id.viewTransactionsAction)

    }



}