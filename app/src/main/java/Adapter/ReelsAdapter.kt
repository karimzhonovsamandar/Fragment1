package Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fragment.databinding.ItemReelsBinding
import com.squareup.picasso.Picasso
import model.ReelsUser

class ReelsAdapter (val context: Context, val list: ArrayList<ReelsUser>) :
    RecyclerView.Adapter<ReelsAdapter.Vh>() {
    inner class Vh(val itemReels: ItemReelsBinding) : RecyclerView.ViewHolder(itemReels.root) {
        fun onBind(item: ReelsUser, position: Int) {
            Picasso.get().load(item.image).into(itemReels.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReelsAdapter.Vh {
        return Vh(ItemReelsBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ReelsAdapter.Vh, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int = list.size

}