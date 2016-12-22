package nyc.c4q.yojana.testanimal;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by yojanasharma on 12/21/16.
 */

public class AnimalAdapter extends RecyclerView.Adapter<AnimalViewHolder> {
    private List<Animals> animalsList;

    public AnimalAdapter (Features features){
        this.animalsList = features.getAnimal();
    }
    @Override
    public AnimalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AnimalViewHolder(parent);
    }

    @Override
    public void onBindViewHolder(AnimalViewHolder holder, int position) {
        holder.bind(animalsList.get(position));
    }

    @Override
    public int getItemCount() {
        return animalsList.size();
    }
}
