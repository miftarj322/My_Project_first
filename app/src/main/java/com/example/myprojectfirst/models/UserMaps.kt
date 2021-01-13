package com.example.myprojectfirst.models

import java.io.Serializable

data class UserMaps(var title: String, var places: List<Place>) : Serializable