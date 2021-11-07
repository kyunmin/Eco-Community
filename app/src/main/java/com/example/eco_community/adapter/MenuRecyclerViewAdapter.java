package com.example.eco_community.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eco_community.LogOutActivity;
import com.example.eco_community.MainActivity;
import com.example.eco_community.MainMenu;
import com.example.eco_community.R;

import java.util.List;

public class MenuRecyclerViewAdapter extends RecyclerView.Adapter<MenuRecyclerViewAdapter.MenuViewHolder>{

    public List<MainMenu> menuList;
    private Context context;

    public MenuRecyclerViewAdapter(Context context, List<MainMenu> menuList) {
        this.context = context;
        this.menuList = menuList;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View menu_row = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_row,null);
        MenuViewHolder menuVH = new MenuViewHolder(menu_row);

        return menuVH;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        holder.tvMenuName.setText(menuList.get(position).getName());
        holder.imgViewMenuImage.setImageResource(menuList.get(position).getImage() );
    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView tvMenuName;
        public ImageView imgViewMenuImage;

        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMenuName = itemView.findViewById(R.id.tv_menu_name);
            imgViewMenuImage = itemView.findViewById(R.id.img_menu);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            /* */
        }
    }
}
