package com.jmarkstar.greendaocrud.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.jmarkstar.greendaocrud.R;
import com.jmarkstar.greendaocrud.model.Nota;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jmarkstar on 20/05/2017.
 */
public class NotaAdapter extends RecyclerView.Adapter<NotaAdapter.NotaViewHolder>{

    final DateFormat df = DateFormat.getDateTimeInstance(DateFormat.MEDIUM, DateFormat.MEDIUM);

    private NotaClickListener clickListener;
    private EditarNotaClickListener editarNotaClickListener;
    private List<Nota> notas;

    public NotaAdapter(NotaClickListener notaClickListener, EditarNotaClickListener editarNotaClickListener){
        this.clickListener = notaClickListener;
        this.editarNotaClickListener = editarNotaClickListener;
        this.notas = new ArrayList<Nota>();
    }

    public void setNotas(@NonNull List<Nota> notas) {
        this.notas = notas;
        notifyDataSetChanged();
    }

    public Nota getNota(int position) {
        return notas.get(position);
    }

    @Override public NotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_notas_item, parent, false);
        return new NotaViewHolder(view, clickListener);
    }

    @Override public void onBindViewHolder(NotaViewHolder holder, int position) {
        Nota nota = notas.get(position);
        holder.tvTexto.setText(nota.getTexto());
        String fecha = "Agregado el " + df.format(new Date());
        holder.tvFecha.setText(fecha);
    }

    @Override public int getItemCount() {
        return notas.size();
    }

    class NotaViewHolder extends RecyclerView.ViewHolder{

        ImageView ivEditar;
        TextView tvTexto;
        TextView tvFecha;

        public NotaViewHolder(View itemView, final NotaClickListener clickListener) {
            super(itemView);
            ivEditar = (ImageView)itemView.findViewById(R.id.iv_icono);
            tvTexto = (TextView)itemView.findViewById(R.id.tv_titulo);
            tvFecha = (TextView)itemView.findViewById(R.id.tv_fecha);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override public void onClick(View view) {
                    if (clickListener != null) {
                        clickListener.onNoteClick(getAdapterPosition());
                    }
                }
            });
            ivEditar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (editarNotaClickListener != null) {
                        editarNotaClickListener.onEditarNoteClick(getAdapterPosition());
                    }
                }
            });
        }
    }

    public interface EditarNotaClickListener {
        void onEditarNoteClick(int position);
    }

    public interface NotaClickListener {
        void onNoteClick(int position);
    }
}
