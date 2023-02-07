package uz.toza.kattabozor.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.toza.domain.model.AttributeModel
import uz.toza.kattabozor.databinding.ItemOfferBinding
import uz.toza.kattabozor.databinding.SubOfferItemBinding

class SubOfferAdapter(private var list: List<AttributeModel>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding =
            SubOfferItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SubAdapterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is SubAdapterViewHolder) {
            holder.binding.apply {
                txtAttributes.text = "${list[position].name} ${list[position].value}"
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class SubAdapterViewHolder(var binding: SubOfferItemBinding) :
        RecyclerView.ViewHolder(binding.root)


}