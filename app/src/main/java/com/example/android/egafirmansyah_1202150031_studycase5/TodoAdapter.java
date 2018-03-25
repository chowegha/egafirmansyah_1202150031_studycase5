package com.example.android.egafirmansyah_1202150031_studycase5;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by chowegha on 3/25/2018.
 */

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoViewholder>{

    private ArrayList<TodoModel> list;

    public TodoAdapter(ArrayList<TodoModel> list) {
        this.list = list;
    }


    @Override
    public TodoViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_todo, parent, false);
        return new TodoViewholder(view);
    }

    @Override
    public void onBindViewHolder(TodoViewholder holder, int position) {
        TodoModel item = list.get(position);
        holder.bindTo(item);
    }

    @Override
    public int getItemCount() {
        return list.size()>0?list.size():0;
    }

    class TodoViewholder extends RecyclerView.ViewHolder{

        private TextView lblTodoID, lblTodoName, lblTodoDesc, lblTodoPrior;
        private TodoModel currTodo;

        public TodoViewholder(View itemView) {
            super(itemView);
            //lblTodoID=(TextView)itemView.findViewById(R.id.lblTodoID);
            lblTodoName=(TextView)itemView.findViewById(R.id.lblTodoNama);
            lblTodoDesc=(TextView)itemView.findViewById(R.id.lblTodoDesc);
            lblTodoPrior=(TextView)itemView.findViewById(R.id.lblTodoPrior);
        }

        public void bindTo(TodoModel todoModel){
            currTodo = todoModel;
            //lblTodoID.setText(""+currTodo.getId());
            lblTodoName.setText(currTodo.getName());
            lblTodoDesc.setText(currTodo.getDescription());
            lblTodoPrior.setText(""+currTodo.getPriority());
        }
    }
}

