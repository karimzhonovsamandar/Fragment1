package Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragment.databinding.ItemRv1Binding
import model.Item


class PhotoAdapter(val context: Context, val list: ArrayList<Item>) :
    RecyclerView.Adapter<PhotoAdapter.Vh>() {
    inner class Vh(val itemRv1: ItemRv1Binding) : RecyclerView.ViewHolder(itemRv1.root) {
        fun onBind(item: Item, position: Int) {
            itemRv1.image1.setImageResource(item.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoAdapter.Vh {
        return Vh(ItemRv1Binding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: PhotoAdapter.Vh, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size

}