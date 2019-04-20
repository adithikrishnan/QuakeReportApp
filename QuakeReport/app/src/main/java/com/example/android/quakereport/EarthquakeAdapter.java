package com.example.android.quakereport;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
      public EarthquakeAdapter(Context context, List<Earthquakes> earthquakes) {
          super(context, 0, earthquakes);
      }
      
      @Override
      public View getView(int position, View convertView, ViewGroup parent){
            View listItemView = convertView;
            if(listItemView == null)
                listItemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
            
            Earthquake currentEarthquake = getItem(position);
            
            TextView magnitudeTextView = listItemView.findViewById(R.id.magnitude);
            magnitudeTextView.setText(currentEarthquake.getMagnitude());
            TextView locationTextView = listItemView.findViewById(R.id.location);
            locationTextView.setText(currentEarthquake.getLocation());
            TextView dateTextView = listItemView.findViewById(R.id.date);
            dateTextView.setText(currentEarthquake.getDate());
            
            return listItemView;
      }
}
