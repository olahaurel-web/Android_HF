package com.example.hazi06.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.hazi06.R;
import com.example.hazi06.models.CurrencyItem;

import org.jetbrains.annotations.NonBlocking;

import java.util.List;

public class CurrencyAdapter extends ArrayAdapter<CurrencyItem> {

    public CurrencyAdapter(@NonNull Context context, List<CurrencyItem> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_currency, parent, false);
        }

        CurrencyItem item = getItem(position);

        ImageView imgFlag = convertView.findViewById(R.id.imgFlag);
        TextView tvCode = convertView.findViewById(R.id.tvCode);
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvBuy = convertView.findViewById(R.id.tvBuy);
        TextView tvSell = convertView.findViewById(R.id.tvSell);

        if (item != null) {
            imgFlag.setImageResource(item.getFlagResID());

            tvCode.setText(item.getCode());
            tvName.setText(item.getName());

            tvBuy.setText("Cumpar " + item.getBuyPrice());
            tvSell.setText("Vinde " +item.getSellPrice());
        }
        return convertView;

    }

}
