package ru.developer.android;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.developer.android.widgets.WidgetsMain;

public class AdapterTutorial extends RecyclerView.Adapter<AdapterTutorial.ViewHolder> {

    private final Context context;
    private List<Tutorial> tutorials;

    public AdapterTutorial(Context context, List<Tutorial> tutorials) {
        this.context = context;
        this.tutorials = tutorials;
    }

    @NonNull
    @Override
    public AdapterTutorial.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tutorial,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterTutorial.ViewHolder holder, int position) {
        Tutorial tutorial = tutorials.get(position);
        holder.iconView.setImageResource(tutorial.getIconTutorial());
        holder.nameView.setText(tutorial.getNameTutorial());
    }

    @Override
    public int getItemCount() {
        return tutorials.size();
    }




    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        final ImageView iconView;
        final TextView nameView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);
            iconView = itemView.findViewById(R.id.icon_tutorial);
            nameView = itemView.findViewById(R.id.name_tutorial);

        }

        @Override
        public void onClick(View v) {
            switch (getAdapterPosition()){
                case 0:
                    Intent intent = new Intent(context, WidgetsMain.class);
                    Toast.makeText(context, "Нажата 1", Toast.LENGTH_SHORT).show();
                    break;
                case 1:
                    //  Intent intent = new Intent(context, QuoteGreatPeople.class);
                    Toast.makeText(context, "Нажата 2", Toast.LENGTH_SHORT).show();
                    break;
                case 2:
                    //  Intent intent = new Intent(context, QuoteGreatPeople.class);
                    Toast.makeText(context, "Нажата 3", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    }
}
