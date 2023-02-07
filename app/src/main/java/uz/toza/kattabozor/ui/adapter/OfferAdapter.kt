package uz.toza.kattabozor.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import uz.toza.domain.model.AttributeModel
import uz.toza.domain.model.Offer
import uz.toza.kattabozor.databinding.ItemOfferBinding


class OfferAdapter(private var list: ArrayList<Offer>, private val context: Context) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding =
            ItemOfferBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is MyViewHolder) {
            holder.binding.apply {
                Glide.with(context).load(list[position].image).into(image)
                txtBrand.text = list[position].brand
                txtMerchant.text = list[position].merchant
                txtName.text = list[position].name
                txtMerchant.text = list[position].merchant
                setSubAdapter(recyclerView = subRecyclerview, list[position].attributes)
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MyViewHolder(var binding: ItemOfferBinding) :
        RecyclerView.ViewHolder(binding.root)

    private fun setSubAdapter(recyclerView: RecyclerView, list: List<AttributeModel>) {
        recyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter=SubOfferAdapter(list)
    }
}