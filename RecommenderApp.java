import org.apache.mahout.cf.taste.eval.DataModelBuilder;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.apache.mahout.cf.taste.recommender.*;

import java.io.File;
import java.util.List;

public class RecommenderApp {
    public static void main(String[] args) {
        try {
            // Load the dataset
            DataModel model = new FileDataModel(new File("data/ratings.csv"));

            // Define similarity between users
            UserSimilarity similarity = new PearsonCorrelationSimilarity(model);

            // Find the nearest neighbors
            UserNeighborhood neighborhood = new NearestNUserNeighborhood(2, similarity, model);

            // Create the recommender
            Recommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);

            // Recommend 3 items for user with ID 2
            List<RecommendedItem> recommendations = recommender.recommend(2, 3);

            // Output the recommendations
            System.out.println("Recommendations for User 2:");
            for (RecommendedItem recommendation : recommendations) {
                System.out.println("Item ID: " + recommendation.getItemID() +
                                   ", Strength: " + recommendation.getValue());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
