package rus.dafi.tryout_pas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BangunDatarAdapter extends RecyclerView.Adapter<BangunDatarAdapter.ViewHolder> {

    private List<BangunDatarModel> listBangunDatar;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(BangunDatarModel bangundatar);
    }

    // Constructor
    public BangunDatarAdapter(List<BangunDatarModel> listBangunDatar, OnItemClickListener listener) {
        this.listBangunDatar = listBangunDatar;
        this.listener = listener;
    }

    // ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNamaBangunDatar, tvLuasBangunDatar, tvKelilingBangunDatar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNamaBangunDatar = itemView.findViewById(R.id.tvNamaBangunDatar);
            tvLuasBangunDatar = itemView.findViewById(R.id.tvLuas);
            tvKelilingBangunDatar = itemView.findViewById(R.id.tvKeliling);
            itemView.setOnClickListener(v -> {
                int position = getAdapterPosition();
                listener.onItemClick(listBangunDatar.get(position));
            });
        }
    }

    @NonNull
    @Override
    public BangunDatarAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_bangun_datar, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BangunDatarAdapter.ViewHolder holder, int position) {
        String namaBangunDatar = listBangunDatar.get(position).getnamaBangunDatar();
        String luasBangunDatar = listBangunDatar.get(position).getluasBangunDatar();
        String kelilingBangunDatar = listBangunDatar.get(position).getkelilingBangunDatar();

        holder.tvNamaBangunDatar.setText(namaBangunDatar);
        holder.tvLuasBangunDatar.setText(luasBangunDatar);
        holder.tvKelilingBangunDatar.setText(kelilingBangunDatar);
    }

    @Override
    public int getItemCount() {
        return listBangunDatar.size();
    }
}