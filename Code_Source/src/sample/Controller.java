package sample;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;


import javafx.scene.text.Text;

import static javafx.scene.paint.Color.WHITE;
import static sample.Resistor.*;

/**
 * Controller est la classe de contrôle de l'interface graphique
 *
 * @author Laurent Chevalier Guillaume Maerten
 */

public class Controller {
    boolean ohm;
    boolean kohm;
    boolean mohm;


    @FXML
    private Rectangle five_band_first_band_decoder;

    @FXML
    private Rectangle five_band_second_band_decoder;

    @FXML
    private Rectangle five_band_third_band_decoder;

    @FXML
    private Rectangle five_band_fourth_band_decoder;

    @FXML
    private Rectangle five_band_fifth_band_decoder;

    @FXML
    private TextField decodedvalue_five_band;

    @FXML
    private Rectangle four_band_first_band_decoder;

    @FXML
    private Rectangle four_band_second_band_decoder;

    @FXML
    private Rectangle four_band_third_band_decoder;

    @FXML
    private Rectangle four_band_fourth_band_decoder;

    @FXML
    private RadioButton radioohm;

    @FXML
    private Button compute_four_band;
    @FXML
    private RadioButton radiokhom;

    @FXML
    private RadioButton radiomohm;

    @FXML
    private Text Unit_calculator;

    @FXML
    private Text Unit_five_band_decoder;

    @FXML
    private TextField Tolerancevalue_five_band;

    @FXML
    private TextField decodedvalue_four_band;

    @FXML
    void BLANC_first_band_five_band_decoder (ActionEvent event) {
        five_band_first_band_decoder.setFill (WHITE);
        FiveBandDecoder.getInstance ().setColours (Colours.WHITE, 0);
    }

    @FXML
    void BLANC_first_band_four_band_decoder (ActionEvent event) {
        four_band_first_band_decoder.setFill (WHITE);
        FourBandDecoder.getInstance ().setColours (Colours.WHITE, 0);

    }

    @FXML
    void BLANC_second_band_five_band_decoder (ActionEvent event) {
        five_band_second_band_decoder.setFill (WHITE);
        FiveBandDecoder.getInstance ().setColours (Colours.WHITE, 1);
    }

    @FXML
    void BLANC_second_band_four_band_decoder (ActionEvent event) {
        four_band_second_band_decoder.setFill (WHITE);
        FourBandDecoder.getInstance ().setColours (Colours.WHITE, 1);
    }

    @FXML
    void BLANC_third_band_five_band_decoder (ActionEvent event) {
        five_band_third_band_decoder.setFill (WHITE);
        FiveBandDecoder.getInstance ().setColours (Colours.WHITE, 2);
    }

    @FXML
    void BLEU_fifth_band_five_band_decoder (ActionEvent event) {
        five_band_fifth_band_decoder.setFill (Paint.valueOf ("#065ffc"));
        FiveBandDecoder.getInstance ().setColours (Colours.BLUE, 4);
    }

    @FXML
    void BLEU_first_band_five_band_decoder (ActionEvent event) {
        five_band_first_band_decoder.setFill (Paint.valueOf ("#065ffc"));
        FiveBandDecoder.getInstance ().setColours (Colours.BLUE, 0);
    }

    @FXML
    void BLEU_first_band_four_band_decoder (ActionEvent event) {
        four_band_first_band_decoder.setFill (Paint.valueOf ("#065ffc"));
        FourBandDecoder.getInstance ().setColours (Colours.BLUE, 0);
    }

    @FXML
    void BLEU_fourth_band_five_band_decoder (ActionEvent event) {
        five_band_fourth_band_decoder.setFill (Paint.valueOf ("#065ffc"));
        FiveBandDecoder.getInstance ().setColours (Colours.BLUE, 3);
    }

    @FXML
    void BLEU_fourth_band_four_band_decoder (ActionEvent event) {
        four_band_fourth_band_decoder.setFill (Paint.valueOf ("#065ffc"));
        FourBandDecoder.getInstance ().setColours (Colours.BLUE, 3);
    }

    @FXML
    private Text Unit_four_band_decoder;

    @FXML
    void BLEU_second_band_five_band_decoder (ActionEvent event) {
        five_band_second_band_decoder.setFill (Paint.valueOf ("#065ffc"));
        FiveBandDecoder.getInstance ().setColours (Colours.BLUE, 1);
    }
    @FXML
    private TextField Tolerancevalue_four_band;
    @FXML
    void BLEU_second_band_four_band_decoder (ActionEvent event) {
        four_band_second_band_decoder.setFill (Paint.valueOf ("#065ffc"));
        FourBandDecoder.getInstance ().setColours (Colours.BLUE, 1);
    }

    @FXML
    void BLEU_third_band_five_band_decoder (ActionEvent event) {
        five_band_third_band_decoder.setFill (Paint.valueOf ("#065ffc"));
        FiveBandDecoder.getInstance ().setColours (Colours.BLUE, 2);
    }

    @FXML
    void BLEU_third_band_four_band_decoder (ActionEvent event) {
        four_band_third_band_decoder.setFill (Paint.valueOf ("#065ffc"));
        FourBandDecoder.getInstance ().setColours (Colours.BLUE, 2);
    }

    @FXML
    void BRUN_fifth_band_five_band_decoder (ActionEvent event) {
        five_band_fifth_band_decoder.setFill (Paint.valueOf ("#994D00"));
        FiveBandDecoder.getInstance ().setColours (Colours.BROWN, 4);
    }

    @FXML
    void BRUN_first_band_five_band_decoder (ActionEvent event) {
        five_band_first_band_decoder.setFill (Paint.valueOf ("#994D00"));
        FiveBandDecoder.getInstance ().setColours (Colours.BROWN, 0);
    }

    @FXML
    void BRUN_first_band_four_band_decoder (ActionEvent event) {
        four_band_first_band_decoder.setFill (Paint.valueOf ("#994D00"));
        FourBandDecoder.getInstance ().setColours (Colours.BROWN, 0);

    }

    @FXML
    void BRUN_fourth_band_five_band_decoder (ActionEvent event) {
        five_band_fourth_band_decoder.setFill (Paint.valueOf ("#994D00"));
        FiveBandDecoder.getInstance ().setColours (Colours.BROWN, 3);
    }

    @FXML
    void BRUN_fourth_band_four_band_decoder (ActionEvent event) {
        four_band_fourth_band_decoder.setFill (Paint.valueOf ("#994D00"));
        FourBandDecoder.getInstance ().setColours (Colours.BROWN, 3);
    }

    @FXML
    void BRUN_second_band_five_band_decoder (ActionEvent event) {
        five_band_second_band_decoder.setFill (Paint.valueOf ("#994D00"));
        FiveBandDecoder.getInstance ().setColours (Colours.BROWN, 1);
    }

    @FXML
    void BRUN_second_band_four_band_decoder (ActionEvent event) {
        four_band_second_band_decoder.setFill (Paint.valueOf ("#994D00"));
        FourBandDecoder.getInstance ().setColours (Colours.BROWN, 1);
    }

    @FXML
    void BRUN_third_band_five_band_decoder (ActionEvent event) {
        five_band_third_band_decoder.setFill (Paint.valueOf ("#994D00"));
        FiveBandDecoder.getInstance ().setColours (Colours.BROWN, 2);
    }

    @FXML
    void BRUN_third_band_four_band_decoder (ActionEvent event) {
        four_band_third_band_decoder.setFill (Paint.valueOf ("#994D00"));
        FourBandDecoder.getInstance ().setColours (Colours.BROWN, 2);
    }

    @FXML
    void GOLD_fifth_band_five_band_decoder (ActionEvent event) {
        five_band_fifth_band_decoder.setFill (Paint.valueOf ("#DAA520"));
        FiveBandDecoder.getInstance ().setColours (Colours.GOLD, 4);
    }

    @FXML
    void GOLD_fourth_band_five_band_decoder (ActionEvent event) {
        five_band_fourth_band_decoder.setFill (Paint.valueOf ("#DAA520"));
        FiveBandDecoder.getInstance ().setColours (Colours.GOLD, 3);
    }

    @FXML
    void GOLD_fourth_band_four_band_decoder (ActionEvent event) {
        four_band_fourth_band_decoder.setFill (Paint.valueOf ("#DAA520"));
        FourBandDecoder.getInstance ().setColours (Colours.GOLD, 3);
    }

    @FXML
    void GOLD_third_band_four_band_decoder (ActionEvent event) {
        four_band_third_band_decoder.setFill (Paint.valueOf ("#DAA520"));
        FourBandDecoder.getInstance ().setColours (Colours.GOLD, 2);
    }

    @FXML
    void GRIS_first_band_five_band_decoder (ActionEvent event) {
        five_band_first_band_decoder.setFill (Paint.valueOf ("#808080"));
        FiveBandDecoder.getInstance ().setColours (Colours.GREY, 0);
    }

    @FXML
    void GRIS_first_band_four_band_decoder (ActionEvent event) {
        four_band_first_band_decoder.setFill (Paint.valueOf ("#808080"));
        FourBandDecoder.getInstance ().setColours (Colours.GREY, 0);
    }

    @FXML
    void GRIS_second_band_five_band_decoder (ActionEvent event) {
        five_band_second_band_decoder.setFill (Paint.valueOf ("#808080"));
        FiveBandDecoder.getInstance ().setColours (Colours.GREY, 1);
    }

    @FXML
    void GRIS_second_band_four_band_decoder (ActionEvent event) {
        four_band_second_band_decoder.setFill (Paint.valueOf ("#808080"));
        FourBandDecoder.getInstance ().setColours (Colours.GREY, 1);
    }

    @FXML
    void GRIS_third_band_five_band_decoder (ActionEvent event) {
        five_band_third_band_decoder.setFill (Paint.valueOf ("#808080"));
        FiveBandDecoder.getInstance ().setColours (Colours.GREY, 2);
    }

    @FXML
    void JAUNE_first_band_five_band_decoder (ActionEvent event) {
        five_band_first_band_decoder.setFill (Paint.valueOf ("#f7ff00"));
        FiveBandDecoder.getInstance ().setColours (Colours.YELLOW, 0);
    }

    @FXML
    void JAUNE_first_band_four_band_decoder (ActionEvent event) {
        four_band_first_band_decoder.setFill (Paint.valueOf ("#f7ff00"));
        FourBandDecoder.getInstance ().setColours (Colours.YELLOW, 0);
    }

    @FXML
    void JAUNE_fourth_band_five_band_decoder (ActionEvent event) {
        five_band_fourth_band_decoder.setFill (Paint.valueOf ("#f7ff00"));
        FiveBandDecoder.getInstance ().setColours (Colours.YELLOW, 3);
    }

    @FXML
    void JAUNE_second_band_five_band_decoder (ActionEvent event) {
        five_band_second_band_decoder.setFill (Paint.valueOf ("#f7ff00"));
        FiveBandDecoder.getInstance ().setColours (Colours.YELLOW, 1);
    }

    @FXML
    void JAUNE_second_band_four_band_decoder (ActionEvent event) {
        four_band_second_band_decoder.setFill (Paint.valueOf ("#f7ff00"));
        FourBandDecoder.getInstance ().setColours (Colours.YELLOW, 1);
    }

    @FXML
    void JAUNE_third_band_five_band_decoder (ActionEvent event) {
        five_band_third_band_decoder.setFill (Paint.valueOf ("#f7ff00"));
        FiveBandDecoder.getInstance ().setColours (Colours.YELLOW, 2);
    }

    @FXML
    void JAUNE_third_band_four_band_decoder (ActionEvent event) {
        four_band_third_band_decoder.setFill (Paint.valueOf ("#f7ff00"));
        FourBandDecoder.getInstance ().setColours (Colours.YELLOW, 2);
    }

    @FXML
    void Noir_first_band_five_band_decoder (ActionEvent event) {
        five_band_first_band_decoder.setFill (Paint.valueOf ("#000000"));
        FiveBandDecoder.getInstance ().setColours (Colours.BLACK, 0);
    }

    @FXML
    void Noir_first_band_four_band_decoder (ActionEvent event) {
        four_band_first_band_decoder.setFill (Paint.valueOf ("#000000"));
        FourBandDecoder.getInstance ().setColours (Colours.BLACK, 0);
    }

    @FXML
    void Noir_fourth_band_five_band_decoder (ActionEvent event) {
        five_band_fourth_band_decoder.setFill (Paint.valueOf ("#000000"));
        FiveBandDecoder.getInstance ().setColours (Colours.BLACK, 3);
    }

    @FXML
    void Noir_second_band_five_band_decoder (ActionEvent event) {
        five_band_second_band_decoder.setFill (Paint.valueOf ("#000000"));
        FiveBandDecoder.getInstance ().setColours (Colours.BLACK, 1);
    }

    @FXML
    void Noir_second_band_four_band_decoder (ActionEvent event) {
        four_band_second_band_decoder.setFill (Paint.valueOf ("#000000"));
        FourBandDecoder.getInstance ().setColours (Colours.BLACK, 1);
    }

    @FXML
    void Noir_third_band_five_band_decoder (ActionEvent event) {
        five_band_third_band_decoder.setFill (Paint.valueOf ("#000000"));
        FiveBandDecoder.getInstance ().setColours (Colours.BLACK, 2);
    }

    @FXML
    void Noir_third_band_four_band_decoder (ActionEvent event) {
        four_band_third_band_decoder.setFill (Paint.valueOf ("#000000"));
        FourBandDecoder.getInstance ().setColours (Colours.BLACK, 2);
    }

    @FXML
    void ORANGE_first_band_five_band_decoder (ActionEvent event) {
        five_band_first_band_decoder.setFill (Paint.valueOf ("#ff9d00"));
        FiveBandDecoder.getInstance ().setColours (Colours.ORANGE, 0);
    }

    @FXML
    void ORANGE_first_band_four_band_decoder (ActionEvent event) {
        four_band_first_band_decoder.setFill (Paint.valueOf ("#ff9d00"));
        FourBandDecoder.getInstance ().setColours (Colours.ORANGE, 0);
    }

    @FXML
    void ORANGE_fourth_band_five_band_decoder (ActionEvent event) {
        five_band_fourth_band_decoder.setFill (Paint.valueOf ("#ff9d00"));
        FiveBandDecoder.getInstance ().setColours (Colours.ORANGE, 3);
    }

    @FXML
    void ORANGE_second_band_five_band_decoder (ActionEvent event) {
        five_band_second_band_decoder.setFill (Paint.valueOf ("#ff9d00"));
        FiveBandDecoder.getInstance ().setColours (Colours.ORANGE, 1);
    }

    @FXML
    void ORANGE_second_band_four_band_decoder (ActionEvent event) {
        four_band_second_band_decoder.setFill (Paint.valueOf ("#ff9d00"));
        FourBandDecoder.getInstance ().setColours (Colours.ORANGE, 1);
    }

    @FXML
    void ORANGE_third_band_five_band_decoder (ActionEvent event) {
        five_band_third_band_decoder.setFill (Paint.valueOf ("#ff9d00"));
        FiveBandDecoder.getInstance ().setColours (Colours.ORANGE, 2);
    }

    @FXML
    void ORANGE_third_band_four_band_decoder (ActionEvent event) {
        four_band_third_band_decoder.setFill (Paint.valueOf ("#ff9d00"));
        FourBandDecoder.getInstance ().setColours (Colours.ORANGE, 2);
    }

    @FXML
    void ROUGE_fifth_band_five_band_decoder (ActionEvent event) {
        five_band_fifth_band_decoder.setFill (Paint.valueOf ("#ff0000"));
        FiveBandDecoder.getInstance ().setColours (Colours.RED, 4);
    }

    @FXML
    void ROUGE_first_band_five_band_decoder (ActionEvent event) {
        five_band_first_band_decoder.setFill (Paint.valueOf ("#ff0000"));
        FiveBandDecoder.getInstance ().setColours (Colours.RED, 0);
    }

    @FXML
    void ROUGE_first_band_four_band_decoder (ActionEvent event) {
        four_band_first_band_decoder.setFill (Paint.valueOf ("#ff0000"));
        FourBandDecoder.getInstance ().setColours (Colours.RED, 0);
    }

    @FXML
    void ROUGE_fourth_band_five_band_decoder (ActionEvent event) {
        five_band_fourth_band_decoder.setFill (Paint.valueOf ("#ff0000"));
        FiveBandDecoder.getInstance ().setColours (Colours.RED, 3);
    }

    @FXML
    void ROUGE_fourth_band_four_band_decoder (ActionEvent event) {
        four_band_fourth_band_decoder.setFill (Paint.valueOf ("#ff0000"));
        FourBandDecoder.getInstance ().setColours (Colours.RED, 3);
    }

    @FXML
    void ROUGE_second_band_five_band_decoder (ActionEvent event) {
        five_band_second_band_decoder.setFill (Paint.valueOf ("#ff0000"));
        FiveBandDecoder.getInstance ().setColours (Colours.RED, 1);
    }

    @FXML
    void ROUGE_second_band_four_band_decoder (ActionEvent event) {
        four_band_second_band_decoder.setFill (Paint.valueOf ("#ff0000"));
        FourBandDecoder.getInstance ().setColours (Colours.RED, 1);
    }

    @FXML
    void ROUGE_third_band_five_band_decoder (ActionEvent event) {
        five_band_third_band_decoder.setFill (Paint.valueOf ("#ff0000"));
        FiveBandDecoder.getInstance ().setColours (Colours.RED, 2);
    }

    @FXML
    void ROUGE_third_band_four_band_decoder (ActionEvent event) {
        four_band_third_band_decoder.setFill (Paint.valueOf ("#ff0000"));
        FourBandDecoder.getInstance ().setColours (Colours.RED, 2);
    }

    @FXML
    void SILVER_fifth_band_five_band_decoder (ActionEvent event) {
        five_band_fifth_band_decoder.setFill (Paint.valueOf ("#C0C0C0"));
        FiveBandDecoder.getInstance ().setColours (Colours.SILVER, 4);
    }

    @FXML
    void SILVER_fourth_band_five_band_decoder (ActionEvent event) {
        five_band_fourth_band_decoder.setFill (Paint.valueOf ("#C0C0C0"));
        FiveBandDecoder.getInstance ().setColours (Colours.SILVER, 3);
    }

    @FXML
    void SILVER_fourth_band_four_band_decoder (ActionEvent event) {
        four_band_fourth_band_decoder.setFill (Paint.valueOf ("#C0C0C0"));
        FourBandDecoder.getInstance ().setColours (Colours.SILVER, 3);
    }

    @FXML
    void SILVER_third_band_four_band_decoder (ActionEvent event) {
        four_band_third_band_decoder.setFill (Paint.valueOf ("#C0C0C0"));
        FourBandDecoder.getInstance ().setColours (Colours.SILVER, 2);
    }

    @FXML
    void VERT_fifth_band_five_band_decoder (ActionEvent event) {
        five_band_fifth_band_decoder.setFill (Paint.valueOf ("#09a800"));
        FiveBandDecoder.getInstance ().setColours (Colours.GREEN, 4);
    }

    @FXML
    void VERT_first_band_five_band_decoder (ActionEvent event) {
        five_band_first_band_decoder.setFill (Paint.valueOf ("#09a800"));
        FiveBandDecoder.getInstance ().setColours (Colours.GREEN, 0);
    }

    @FXML
    void VERT_first_band_four_band_decoder (ActionEvent event) {
        four_band_first_band_decoder.setFill (Paint.valueOf ("#09a800"));
        FourBandDecoder.getInstance ().setColours (Colours.GREEN, 0);
    }

    @FXML
    void VERT_fourth_band_five_band_decoder (ActionEvent event) {
        five_band_fourth_band_decoder.setFill (Paint.valueOf ("#09a800"));
        FiveBandDecoder.getInstance ().setColours (Colours.GREEN, 3);
    }

    @FXML
    void VERT_fourth_band_four_band_decoder (ActionEvent event) {
        four_band_fourth_band_decoder.setFill (Paint.valueOf ("#09a800"));
        FourBandDecoder.getInstance ().setColours (Colours.GREEN, 3);
    }

    @FXML
    void VERT_second_band_five_band_decoder (ActionEvent event) {
        five_band_second_band_decoder.setFill (Paint.valueOf ("#09a800"));
        FiveBandDecoder.getInstance ().setColours (Colours.GREEN, 1);
    }

    @FXML
    void VERT_second_band_four_band_decoder (ActionEvent event) {
        four_band_second_band_decoder.setFill (Paint.valueOf ("#09a800"));
        FourBandDecoder.getInstance ().setColours (Colours.GREEN, 1);
    }

    @FXML
    void VERT_third_band_five_band_decoder (ActionEvent event) {
        five_band_third_band_decoder.setFill (Paint.valueOf ("#09a800"));
        FiveBandDecoder.getInstance ().setColours (Colours.GREEN, 2);
    }

    @FXML
    void VERT_third_band_four_band_decoder (ActionEvent event) {
        four_band_third_band_decoder.setFill (Paint.valueOf ("#09a800"));
        FourBandDecoder.getInstance ().setColours (Colours.GREEN, 2);
    }

    @FXML
    void VIOLET_fifth_band_five_band_decoder (ActionEvent event) {
        five_band_fifth_band_decoder.setFill (Paint.valueOf ("#aa03be"));
        FiveBandDecoder.getInstance ().setColours (Colours.PURPLE, 4);
    }

    @FXML
    void VIOLET_first_band_five_band_decoder (ActionEvent event) {
        five_band_first_band_decoder.setFill (Paint.valueOf ("#aa03be"));
        FiveBandDecoder.getInstance ().setColours (Colours.PURPLE, 0);
    }

    @FXML
    void VIOLET_first_band_four_band_decoder (ActionEvent event) {
        four_band_first_band_decoder.setFill (Paint.valueOf ("#aa03be"));
        FourBandDecoder.getInstance ().setColours (Colours.PURPLE, 0);
    }

    @FXML
    void VIOLET_fourth_band_five_band_decoder (ActionEvent event) {
        five_band_fourth_band_decoder.setFill (Paint.valueOf ("#aa03be"));
        FiveBandDecoder.getInstance ().setColours (Colours.PURPLE, 3);
    }

    @FXML
    void VIOLET_fourth_band_four_band_decoder (ActionEvent event) {
        four_band_fourth_band_decoder.setFill (Paint.valueOf ("#aa03be"));
        FourBandDecoder.getInstance ().setColours (Colours.PURPLE, 3);
    }

    @FXML
    void VIOLET_second_band_five_band_decoder (ActionEvent event) {
        five_band_second_band_decoder.setFill (Paint.valueOf ("#aa03be"));
        FiveBandDecoder.getInstance ().setColours (Colours.PURPLE, 1);
    }

    @FXML
    void VIOLET_second_band_four_band_decoder (ActionEvent event) {
        four_band_second_band_decoder.setFill (Paint.valueOf ("#aa03be"));
        FourBandDecoder.getInstance ().setColours (Colours.PURPLE, 1);
    }

    @FXML
    void VIOLET_third_band_five_band_decoder (ActionEvent event) {
        five_band_third_band_decoder.setFill (Paint.valueOf ("#aa03be"));
        FiveBandDecoder.getInstance ().setColours (Colours.PURPLE, 2);
    }

    @FXML
    void VIOLET_third_band_four_band_decoder (ActionEvent event) {
        four_band_third_band_decoder.setFill (Paint.valueOf ("#aa03be"));
        FourBandDecoder.getInstance ().setColours (Colours.PURPLE, 2);
    }

    @FXML
    void presscompute_five_band (ActionEvent event) {
        boolean errorstatus;
        errorstatus = FiveBandDecoder.getInstance ().validateentryfiveband ();

        if (errorstatus) {
            decodedvalue_five_band.setText ("");
        } else {
            FiveBandDecoder.getInstance ().convertcolortovaluefiveband ();
            if (FiveBandDecoder.getInstance ().getFinalvalue () < 1000) {
                Unit_five_band_decoder.setText ("Ω");
            } else if (FiveBandDecoder.getInstance ().getFinalvalue () < 1000000) {
                FiveBandDecoder.getInstance ().setFinalvalue (FiveBandDecoder.getInstance ().getFinalvalue () / 1000);
                Unit_five_band_decoder.setText ("KΩ");
            } else if (FiveBandDecoder.getInstance ().getFinalvalue () < 1000000000) {
                FiveBandDecoder.getInstance ().setFinalvalue (FiveBandDecoder.getInstance ().getFinalvalue () / 1000000);
                Unit_five_band_decoder.setText ("MΩ");
            } else {
                FiveBandDecoder.getInstance ().setFinalvalue (FiveBandDecoder.getInstance ().getFinalvalue () / 1000000000);
                Unit_five_band_decoder.setText ("GΩ");
            }

            if (FiveBandDecoder.getInstance ().getColours (4) == Colours.BROWN) Tolerancevalue_five_band.setText ("±1");
            if (FiveBandDecoder.getInstance ().getColours (4) == Colours.RED) Tolerancevalue_five_band.setText ("±2");
            if (FiveBandDecoder.getInstance ().getColours (4) == Colours.GREEN)
                Tolerancevalue_five_band.setText ("±0.5");
            if (FiveBandDecoder.getInstance ().getColours (4) == Colours.BLUE)
                Tolerancevalue_five_band.setText ("±0.25");
            if (FiveBandDecoder.getInstance ().getColours (4) == Colours.PURPLE)
                Tolerancevalue_five_band.setText ("±0.10");
            if (FiveBandDecoder.getInstance ().getColours (4) == Colours.GREY)
                Tolerancevalue_five_band.setText ("±0.05");
            if (FiveBandDecoder.getInstance ().getColours (4) == Colours.GOLD) Tolerancevalue_five_band.setText ("±5");
            if (FiveBandDecoder.getInstance ().getColours (4) == Colours.SILVER)
                Tolerancevalue_five_band.setText ("±10");

            System.out.println (FiveBandDecoder.getInstance ().getFinalvalue ());
            decodedvalue_five_band.setText (String.valueOf (FiveBandDecoder.getInstance ().getFinalvalue ()));
        }

    }

    @FXML
    void presscompute_four_band(ActionEvent event) {
        boolean errorstatus;
        errorstatus=FourBandDecoder.getInstance().validateentryfourband();

        if(errorstatus){
            decodedvalue_four_band.setText("");
        }
        else {
            FourBandDecoder.getInstance().convertcolortovaluefourband();
            if (FourBandDecoder.getInstance().getFinalvalue() < 1000) {
                Unit_four_band_decoder.setText("Ω");
            } else if (FourBandDecoder.getInstance().getFinalvalue() < 1000000) {
                FourBandDecoder.getInstance().setFinalvalue(FourBandDecoder.getInstance().getFinalvalue() / 1000);
                Unit_four_band_decoder.setText("KΩ");
            } else if (FourBandDecoder.getInstance().getFinalvalue() < 1000000000) {
                FourBandDecoder.getInstance().setFinalvalue(FourBandDecoder.getInstance().getFinalvalue() / 1000000);
                Unit_four_band_decoder.setText("MΩ");
            } else {
                FourBandDecoder.getInstance().setFinalvalue(FourBandDecoder.getInstance().getFinalvalue() / 1000000000);
                Unit_four_band_decoder.setText("GΩ");
            }


            if (FourBandDecoder.getInstance().getColours(3) == Colours.BROWN) Tolerancevalue_four_band.setText("±1");
            if (FourBandDecoder.getInstance().getColours(3) == Colours.RED) Tolerancevalue_four_band.setText("±2");
            if (FourBandDecoder.getInstance().getColours(3) == Colours.GREEN) Tolerancevalue_four_band.setText("±0.5");
            if (FourBandDecoder.getInstance().getColours(3) == Colours.BLUE) Tolerancevalue_four_band.setText("±0.25");
            if (FourBandDecoder.getInstance().getColours(3) == Colours.PURPLE)
                Tolerancevalue_four_band.setText("±0.10");
            if (FourBandDecoder.getInstance().getColours(3) == Colours.GREY) Tolerancevalue_four_band.setText("±0.05");
            if (FourBandDecoder.getInstance().getColours(3) == Colours.GOLD) Tolerancevalue_four_band.setText("±5");
            if (FourBandDecoder.getInstance().getColours(3) == Colours.SILVER) Tolerancevalue_four_band.setText("±10");

            System.out.println(FourBandDecoder.getInstance().getFinalvalue());
            decodedvalue_four_band.setText(String.valueOf(FourBandDecoder.getInstance().getFinalvalue()));
        }

    }

    @FXML
    void presskohm (ActionEvent event) {
        setKohm (true);
        setOhm (false);
        setMohm (false);
        radioohm.setSelected (false);
        radiomohm.setSelected (false);
        Unit_calculator.setText ("KΩ");

    }

    @FXML
    void pressmohm (ActionEvent event) {
        setMohm (true);
        setOhm (false);
        setKohm (false);
        radiokhom.setSelected (false);
        radioohm.setSelected (false);
        Unit_calculator.setText ("MΩ");
    }


    @FXML
    void pressohm (ActionEvent event) {
        setOhm (true);
        setKohm (false);
        setMohm (false);
        radiokhom.setSelected (false);
        radiomohm.setSelected (false);
        Unit_calculator.setText ("Ω");
    }

    /**
     * Met à jour  la valeur de ohm
     *
     * @param ohm mise à jour de la valeur de ohm
     */
    public void setOhm (boolean ohm) {
        this.ohm = ohm;
    }

    /**
     * Met à jour  la valeur de kohm
     *
     * @param kohm mise à jour de la valeur de kohm
     */

    public void setKohm (boolean kohm) {
        this.kohm = kohm;
    }

    /**
     * Met à jour  la valeur de mohm
     *
     * @param mohm mise à jour de la valeur de mohm
     */

    public void setMohm (boolean mohm) {
        this.mohm = mohm;
    }
}