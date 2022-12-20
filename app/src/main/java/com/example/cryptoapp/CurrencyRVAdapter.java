package com.example.cryptoapp;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recylerview.widget.RecyclerView;
public class CurrencyRVAdapter extends RecylerView.Adapter<CurrencyRVAdapter.ViewHolder>{
    private ArrayList<CurrencyRVModal> currencyRVModalArrayList;
    private Context context;
    private static DecimalFormat df2 = new DecimalFormat("#,##");

    public CurrencyRVAdapter(ArrayList<CurrencyRVModal> currencyRVModalArrayList, Context context) {
        this.currencyRVModalArrayList = currencyRVModalArrayList;
        this.context = context;
    }

    @NonNull
    @Override

    public CurrencyRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(context).inflate.(R.layout.currency_rv_item,parent,false);
        return new CurrencyRVAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CurrencyRVAdapter.ViewHolder holder, int position){
        CurrencyRVModal currencyRVModal = currencyRVModalArrayList.get(position);
        holder.currencyNameTV.setText(currencyRVModal.getName());
        holder.symbolTV.setText(currencyRVModal.getSymbol());
        holder.rateTV.setText("$ "+df2.format(currencyRVModal.getPrice()) );
    }

    @Override
    public int getItemCount(){
        return currencyRVModalArrayList.size();
    }

    public class ViewHolder extends RecylerView.ViewHolder{
        public ViewHolder(@NonNull View itemView){
            private TextView currencyNameTV , symbolTV , rateTV;
            super(itemView);
            currencyNameTV = itemView.findViewByID(R.id.idTvCurrencyName);
            symbolTV = itemView.findViewByID(R.id.idTVSymbol);
            rateTV = itemView.findViewByID(R.id.idTVCurrencyRate);
        }
    }

}