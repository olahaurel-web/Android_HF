package com.example.hazi04;// CurrencyAdapter.java
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hazi04.Currency;

import java.util.List;

public class CurrencyAdapter extends ArrayAdapter<Currency> {
    public CurrencyAdapter(Context context, List<Currency> currencies) {
        super(context, 0, currencies);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_currency, parent, false);
        }

        Currency currency = getItem(position);

        ImageView flagImage = convertView.findViewById(R.id.flagImage);
        TextView currencyCode = convertView.findViewById(R.id.currencyCode);
        TextView currencyName = convertView.findViewById(R.id.currencyName);
        TextView buyRate = convertView.findViewById(R.id.buyRate);
        TextView sellRate = convertView.findViewById(R.id.sellRate);

        flagImage.setImageResource(currency.getFlagResId());
        currencyCode.setText(currency.getCode());
        currencyName.setText(currency.getName());
        String buyRateText = String.valueOf(currency.getBuyRate() + " RON");
        String sellRateText = String.valueOf(currency.getSellRate()) + " RON";

        buyRate.setText(buyRateText);
        sellRate.setText(sellRateText);

        return convertView;
    }
}