package com.maubis.scarlet.base.support.ui

import android.content.Context
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetDialog
import android.view.ViewGroup
import com.maubis.scarlet.base.R

class BottomSheetTabletDialog(context: Context, theme: Int) : com.google.android.material.bottomsheet.BottomSheetDialog(context, theme) {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState);
    val width = context.resources.getDimensionPixelSize(R.dimen.bottom_sheet_width_for_tablets);
    getWindow().setLayout(
        if (width > 0) width else ViewGroup.LayoutParams.MATCH_PARENT,
        ViewGroup.LayoutParams.MATCH_PARENT);
  }
}