package com.example.geoposition.data

import com.example.geoposition.model.Place


class PlaceRepository {
    private var markersList = mutableListOf<Place>()

    @JvmName("getMarkersList1")
    fun getMarkersList() = markersList
}