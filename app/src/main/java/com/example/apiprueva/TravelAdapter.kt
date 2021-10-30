package com.example.apiprueva

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apiprueva.databinding.ViajeRowBinding

class TravelAdapter():RecyclerView.Adapter<TravelAdapter.TravelViewHolder>() {
    private var traverList = emptyList<Travel>()

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): TravelViewHolder {
        val binding =ViajeRowBinding
            .inflate(LayoutInflater.from(parent.context),parent,false)

        return TravelViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TravelViewHolder, position: Int) {
        //
    }

    override fun getItemCount(): Int {
        return traverList.size
    }

    fun sumitList(list: List<Travel>){
        traverList = list
        notifyDataSetChanged()
    }


   inner class TravelViewHolder(private val binding:ViajeRowBinding ) :
      RecyclerView.ViewHolder(binding.root) {
       fun bind(item: Travel) {
           binding.viajeIdtextView.text = item.travelId.toString()
           binding.observaciontextView.text = item.observaciones
           binding.millastextView.text = item.millas.toString()

       }
   }
}