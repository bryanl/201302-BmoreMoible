package com.osesm.example.masterdetailui;

import java.io.IOException;
import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.osesm.example.masterdetailui.dummy.Content.Quote;

public class QuoteAdapter extends ArrayAdapter<Quote> {

	public QuoteAdapter(Context context, List<Quote> quotes) {
		super(context, R.layout.adapter_quote, quotes);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		if (row == null) {
			LayoutInflater inflater = (LayoutInflater) this.getContext()
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row = inflater.inflate(R.layout.adapter_quote, parent, false);
		}

		Quote quote = getItem(position);

		TextView quoteTitle = (TextView) row.findViewById(R.id.quote_title);
		quoteTitle.setText(quote.getTitle());

		TextView quoteAuthor = (TextView) row.findViewById(R.id.quote_author);
		quoteAuthor.setText(quote.getAuthor());

		ImageView quoteAvatar = (ImageView) row.findViewById(R.id.quote_avatar);
		try {
			quoteAvatar.setImageDrawable(quote.getAvatar(getContext().getAssets()));
		} catch (IOException e) {
		}

		return row;
	}

}
