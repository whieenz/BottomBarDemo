package com.example.administrator.bottombardemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/6/24.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private LayoutInflater inflater;
    private Context context;
    private List<String> datas;

    public MyAdapter(Context context, List<String> lists) {
        this.context = context;
        datas = lists;
        inflater = LayoutInflater.from(context);

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_simple_textview,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView.setText(datas.get(position));

    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
}

class MyViewHolder extends RecyclerView.ViewHolder{
    TextView textView;
    TextView delete;

    public MyViewHolder(View itemView) {
        super(itemView);

        textView = (TextView) itemView.findViewById(R.id.id_tv);
        delete = (TextView) itemView.findViewById(R.id.id_delete);
    }
}
