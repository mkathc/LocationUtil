package com.android.bodegas.presentation.utils.location

import com.google.android.gms.location.LocationResult

interface CustomLocationListener {
    fun locationResponse(locationResult: LocationResult)

}