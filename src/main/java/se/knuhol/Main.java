package se.knuhol;

import com.cloudinary.Cloudinary;
import com.cloudinary.Transformation;
import com.cloudinary.utils.ObjectUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Map;


public class Main {
    public static void main(String[] args) throws IOException {
        Cloudinary cloudinary = new Cloudinary();

        Document document = Jsoup.connect(args[0]).get();
        String imageUrl = document.getElementById("coverImage").attr("src");

        Map params = ObjectUtils.asMap("transformation", new Transformation().crop("pad").width(300).height(400));
        Map uploadResult = cloudinary.uploader().upload(imageUrl, params);

        System.out.println(uploadResult.get("secure_url"));
    }
}
