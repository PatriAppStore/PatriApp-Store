package com.aurora.store.view.ui.preferences

import android.content.Intent
import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.aurora.store.view.ui.account.AccountActivity



class AccountPreference : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey:String?) {
        val intent = Intent(this.context, AccountActivity::class.java).apply {}
        startActivityForResult(intent, 123)
    }

    // This method is called when the second activity finishes
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        requireActivity().supportFragmentManager.popBackStack()
    }
}