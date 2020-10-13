package edu.madappsdevlopers.kidz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import java.util.List;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class PoemAdapter extends RecyclerView.Adapter<PoemAdapter.ViewHolder>{

    List<PoemModel> poemList;
    Context mContext;

    public PoemAdapter(Context mContext, List<PoemModel> poemList) {
        this.poemList = poemList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.poem_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        PoemModel poem = poemList.get(position);
        holder.textViewMonth.setText(poem.getName());
        //i aded
        holder.poemdata.setText(poem.getPdata());
        //

        Picasso.get().load(poem.getPic()).placeholder(R.drawable.poem0).error(R.drawable.poem0).into(holder.imageViewName);

//        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(mContext,holder.textViewMonth.getText(),Toast.LENGTH_SHORT).show();
//            }
//        });

        boolean isExpanded = poemList.get(position).isExpanded();
        holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return poemList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ConstraintLayout expandableLayout;
        TextView textViewMonth;
        ImageView imageViewName;
        LinearLayout linearLayout;

        //i added
        TextView poemdata;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);

            textViewMonth = itemView.findViewById(R.id.textViewMonth);
            imageViewName = itemView.findViewById(R.id.poemImage);
            expandableLayout = itemView.findViewById(R.id.expandableLayout);
            linearLayout =itemView.findViewById(R.id.parent_layout);
            //i aded
            poemdata = itemView.findViewById(R.id.poemdata);

            textViewMonth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    PoemModel poem = poemList.get(getAdapterPosition());
                    poem.setExpanded(!poem.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
