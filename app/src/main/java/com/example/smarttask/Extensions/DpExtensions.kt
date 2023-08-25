package com.example.smarttask

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.Dp

val Dp.Companion.defaultMargin
    @Composable
    get() = dimensionResource(id = R.dimen.default_margin)

val Dp.Companion.defaultMarginHalf
    @Composable
    get() = dimensionResource(id = R.dimen.default_margin_half)

val Dp.Companion.defaultMarginQuarter
    @Composable
    get() = dimensionResource(id = R.dimen.default_margin_quarter)

val Dp.Companion.defaultMarginQuarterHalf
    @Composable
    get() = dimensionResource(id = R.dimen.default_margin_quarter_half)

val Dp.Companion.defaultMarginAndAHalf
    @Composable
    get() = dimensionResource(id = R.dimen.default_margin_and_a_half)

val Dp.Companion.defaultMarginDouble
    @Composable
    get() = dimensionResource(id = R.dimen.default_margin_double)

val Dp.Companion.defaultMarginTriple
    @Composable
    get() = dimensionResource(id = R.dimen.default_margin_triple)

val Dp.Companion.defaultMarginQuadruple
    @Composable
    get() = dimensionResource(id = R.dimen.default_margin_quadruple)

val Dp.Companion.defaultTextMargin
    @Composable
    get() = dimensionResource(id = R.dimen.default_text_margin)

val Dp.Companion.defaultCornerRadius
    @Composable
    get() = dimensionResource(id = R.dimen.default_corner_radius)

val Dp.Companion.defaultIconSize
    @Composable
    get() = dimensionResource(id = R.dimen.default_icon_size)

val Dp.Companion.defaultSelectedElevation
    @Composable
    get() = dimensionResource(id = R.dimen.default_selected_elevation)