package Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragment.databinding.ItemRvBinding
import model.Item

class StorisAdapter (val context: Context, val list: ArrayList<Item>) :
    RecyclerView.Adapter<StorisAdapter.Vh>() {
    inner class Vh(val itemRv: ItemRvBinding) : RecyclerView.ViewHolder(itemRv.root) {
        fun onBind(item: Item, position: Int) {
            itemRv.image1.setImageResource(item.image)
            itemRv.txt1.text = item.name

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StorisAdapter.Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: StorisAdapter.Vh, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size

}
