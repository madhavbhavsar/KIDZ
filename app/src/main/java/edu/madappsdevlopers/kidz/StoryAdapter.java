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

public class StoryAdapter extends RecyclerView.Adapter<StoryAdapter.ViewHolder>{

    List<StoryModel> storyList;
    Context mContext;

    public StoryAdapter(Context mContext, List<StoryModel> storyList) {
        this.storyList = storyList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.story_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        StoryModel story = storyList.get(position);
        holder.textViewMonth.setText(story.getName());
        //i aded
        holder.storydata.setText(story.getSdata());
        //

        Picasso.get().load(story.getPic()).placeholder(R.drawable.poem0).error(R.drawable.poem0).into(holder.imageViewName);

//        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(mContext,holder.textViewMonth.getText(),Toast.LENGTH_SHORT).show();
//            }
//        });

        boolean isExpanded = storyList.get(position).isExpanded();
        holder.expandableLayout.setVisibility(isExpanded ? View.VISIBLE : View.GONE);
    }

    @Override
    public int getItemCount() {
        return storyList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ConstraintLayout expandableLayout;
        TextView textViewMonth;
        ImageView imageViewName;
        LinearLayout linearLayout;

        //i added
        TextView storydata;

        public ViewHolder(@NonNull final View itemView) {
            super(itemView);

            textViewMonth = itemView.findViewById(R.id.textViewMonth);
            imageViewName = itemView.findViewById(R.id.storyImage);
            expandableLayout = itemView.findViewById(R.id.expandableLayout);
            linearLayout =itemView.findViewById(R.id.parent_layout);
            //i aded
            storydata = itemView.findViewById(R.id.storydata);

            textViewMonth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    StoryModel story = storyList.get(getAdapterPosition());
                    story.setExpanded(!story.isExpanded());
                    notifyItemChanged(getAdapterPosition());
                }
            });
        }
    }
}
