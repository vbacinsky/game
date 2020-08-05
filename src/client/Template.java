package client;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;

import java.awt.*;

public class Template extends VBox {


    public Template (String nick_of_player, boolean isOpponent, Image image) {
        this.setSpacing(20);

        HBox image_nick = new HBox(10);

        VBox nick_money = new VBox(20);
        nick_money.setPadding(new Insets(10, 10, 10, 10));

        nick_money.setAlignment(Pos.CENTER);
        Text nick = new Text(nick_of_player);
        Text money = new Text("100 eur");

        nick_money.getChildren().addAll(nick, money);

        Circle circle = new Circle();
        circle.setRadius(10);
        circle.setFill(Color.WHITE);

        if(image == null) {
            Rectangle rec = new Rectangle(110,185);
            rec.setFill(Color.WHITE);
            image_nick.getChildren().addAll(rec, nick_money, circle);
        } else {
            final ImageView selectedImage = new ImageView();
            selectedImage.setImage(image);
            selectedImage.setFitHeight(185);
            selectedImage.setFitWidth(110);
            image_nick.getChildren().addAll(selectedImage, nick_money, circle);
        }

        HBox positiveChips = new HBox(10);
        positiveChips.getChildren().addAll(new Text("positive chips: "));
        //tu sa potom bude ukladat postupne kazdy jeden chip

        HBox negativeChips = new HBox(10);
        negativeChips.getChildren().addAll(new Text("negative chips: "));
        //tu sa potom bude ukladat postupne kazdy jeden chip


        HBox fromBox = new HBox(10);
        Text castleA = new Text("CASTLE A");
        Text from = new Text("FROM: ");
        from.setFill(Color.WHITE);
        fromBox.getChildren().addAll(from, castleA);


        HBox toBox = new HBox(10);
        Text castleB = new Text("CASTLE B");
        Text to = new Text("TO: ");
        to.setFill(Color.WHITE);
        toBox.getChildren().addAll(to, castleB);

        this.getChildren().addAll(image_nick, positiveChips, negativeChips, fromBox, toBox);


        if(isOpponent == false) {
            HBox buttonBox = new HBox(10);
            Button end = new Button("END");
            Button buy = new Button("BUY");
            Button play = new Button("PLAY");
            Button showRules = new Button("RUL");
            Button showMission = new Button("M");
            buttonBox.getChildren().addAll(end, buy, play, showMission, showRules);
            buttonBox.setAlignment(Pos.BOTTOM_CENTER);
            this.getChildren().add(buttonBox);
        }
    }
}
