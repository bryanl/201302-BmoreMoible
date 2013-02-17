package com.osesm.example.masterdetailui;

import java.io.IOException;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.osesm.example.masterdetailui.dummy.Content;

/**
 * A fragment representing a single Quote detail screen. This fragment is either
 * contained in a {@link QuoteListActivity} in two-pane mode (on tablets) or a
 * {@link QuoteDetailActivity} on handsets.
 */
public class QuoteDetailFragment extends Fragment {
	/**
	 * The fragment argument representing the item ID that this fragment
	 * represents.
	 */
	public static final String ARG_ITEM_ID = "item_id";

	/**
	 * The dummy title this fragment is presenting.
	 */
	private Content.Quote mItem;

	/**
	 * Mandatory empty constructor for the fragment manager to instantiate the
	 * fragment (e.g. upon screen orientation changes).
	 */
	public QuoteDetailFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (getArguments().containsKey(ARG_ITEM_ID)) {
			// Load the dummy title specified by the fragment
			// arguments. In a real-world scenario, use a Loader
			// to load title from a title provider.
			mItem = Content.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
		}
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater
				.inflate(R.layout.fragment_quote_detail, container, false);

		// Show the dummy title as text in a TextView.
		if (mItem != null) {

			TextView title = (TextView) rootView.findViewById(R.id.quote_title);
			title.setText(mItem.getTitle());
			TextView author = (TextView) rootView.findViewById(R.id.quote_author);
			author.setText(mItem.getAuthor());

			ImageView avatar = (ImageView) rootView.findViewById(R.id.quote_avatar);
			try {
				avatar.setImageDrawable(mItem.getAvatar(getActivity().getAssets()));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			WebView content = (WebView) rootView.findViewById(R.id.quote_content);
			content.loadData(mItem.getContent(), "text/html", null);
		}

		return rootView;
	}
}
