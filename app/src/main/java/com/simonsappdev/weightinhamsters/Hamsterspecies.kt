package com.simonsappdev.weightinhamsters

object Hamsterspecies {
    fun getSpecies(): ArrayList<Species> {
        val speciesList = ArrayList<Species>()

            val spec1 = Species(
                "Goldhamster",
                1,
                0.15,
                R.drawable.goldhamster
            )
            speciesList.add(spec1)

            val spec2 = Species(
                "Dwarf Hamster",
                2,
                0.11,
                R.drawable.dwarfhamster
            )
        speciesList.add(spec2)
        return speciesList
        }
    }
