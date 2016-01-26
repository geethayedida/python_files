package com;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class XML {
	
	

	public static void generate(List<String> attribs, List<Double> vals, String fileName) throws FileNotFoundException {
		
			PrintWriter writer = new PrintWriter(fileName);
			writer.println("<?xml version=\"1.0\"?>\n"+
"<argos-configuration>\n"+

  "<!-- FRAMEWORK -->\n"+
  "<framework>\n"+
    "<system threads=\"0\"/>\n"+
    "<experiment length=\"1800\" ticks_per_second=\"16\" random_seed=\"1337\"/>\n"+
  "</framework>\n"+

  "<!-- CONTROLLERS -->\n"+
  "<controllers>\n"+
    "<iAnt_controller id=\"iAnt_c\" library=\"build/controllers/libiAnt_controller.so\">\n"+
      "<actuators>\n"+
        "<differential_steering implementation=\"default\"/>\n"+
      "</actuators>\n"+
      "<sensors>\n"+
        "<footbot_proximity implementation=\"default\" show_rays=\"false\"/>\n"+
        "<positioning implementation=\"default\"/>\n"+
      "</sensors>\n"+
      "<params>\n"+
      
        "<CPFA "+attribs.get(0)+"=\""+vals.get(0)+"\" \n"+
        attribs.get(1)+"=\""+vals.get(1)+"\" \n"+
        attribs.get(2)+"=\""+vals.get(2)+"\" \n"+
        attribs.get(3)+"=\""+vals.get(3)+"\" \n"+
        attribs.get(4)+"=\""+vals.get(4)+"\" \n"+
              "searchRadius=\"1\"\n"+
              "searchStepSize=\"0.08\" \n"+
              "distanceTolerance=\"0.1\" \n"+
              attribs.get(5)+"=\""+vals.get(5)+"\" \n"+
              "angleTolerance=\"22.5\" \n"+
              "maxRobotSpeed=\"16.0\" \n"+
              attribs.get(6)+"=\""+vals.get(6)+"\" /> \n"+
      "</params>\n"+
    "</iAnt_controller>\n"+
  "</controllers>\n"+

  "<!-- LOOP FUNCTIONS -->\n"+
  "<loop_functions library=\"build/loop_functions/libiAnt_loop_functions.so\"\n"+
                  "label=\"iAnt_loop_functions\">\n"+
    "<simulation_settings     variableSeed=\"0\"\n"+
                             "outputData=\"1\"\n"+
                             "nestPosition=\"0.0, 0.0\"\n"+
                             "nestRadius=\"0.5\"\n"+
                             "foodRadius=\"0.05\"\n"+
                             "foodItemCount=\"256\"\n"+
                             "foodDistribution=\"1\"/>\n"+
    "<random_distribution_0/> <!-- no settings for this distribution -->\n"+
    "<cluster_distribution_1  numberOfClusters=\"4\"\n"+
                             "clusterWidthX=\"8\"\n"+
                             "clusterLengthY=\"8\"/>\n"+
    "<powerLaw_distribution_2 powerRank=\"4\"/>\n"+
  "</loop_functions>\n"+

  "<!-- ARENA -->\n"+
  "<arena size=\"10.0, 10.0, 0.0\" center=\"0.0, 0.0, 0.0\">\n"+
    "<floor id=\"floor\" source=\"loop_functions\" pixels_per_meter=\"50\"/>\n"+
    "<distribute>\n"+
      "<position method=\"uniform\" min=\"-1, -1, 0\" max=\"1, 1, 0\"/>\n"+
      "<orientation method=\"gaussian\" mean=\"0, 0, 0\" std_dev=\"360, 0, 0\"/>\n"+
      "<entity quantity=\"6\" max_trials=\"200\">\n"+
        "<foot-bot id=\"fb\">\n"+
          "<controller config=\"iAnt_c\"/>\n"+
        "</foot-bot>\n"+
      "</entity>\n"+
    "</distribute>\n"+

    "<!--\n"+
        "We distribute 5 boxes uniformly in position and rotation around Z.\n"+
    "-->\n"+
    "<!--\n"+
    "<distribute>\n"+
      "<position method=\"uniform\" min=\"-5,-5,0\" max=\"5,5,0\" />\n"+
      "<orientation method=\"uniform\" min=\"0,0,0\" max=\"360,0,0\" />\n"+
      "<entity quantity=\"6\" max_trials=\"100\">\n"+
        "<box id=\"b\" size=\"0.3,0.3,0.25\" movable=\"false\" />\n"+
      "</entity>\n"+
    "</distribute>       --> \n"+

    "<!--\n"+
        "We distribute cylinders uniformly in position and with\n"+
        "constant rotation (rotating a cylinder around Z does not\n"+
        "matter)\n"+
    "-->\n"+
   "<!--\n"+
    "<distribute>\n"+
      "<position method=\"uniform\" min=\"-5,-5,0\" max=\"5,5,0\" />\n"+
      "<orientation method=\"constant\" values=\"0,0,0\" />\n"+
      "<entity quantity=\"6\" max_trials=\"100\">\n"+
        "<cylinder id=\"c\" height=\"0.25\" radius=\"0.15\" movable=\"true\" mass=\"10.0\"/>\n"+
      "</entity>\n"+
    "</distribute>      -->\n"+

  "</arena>\n"+

  "<!-- PHYSICS ENGINE(S) -->\n"+
  "<physics_engines>\n"+
    "<dynamics2d id=\"dyn2d\"/>\n"+
  "</physics_engines>\n"+

  "<!-- MEDIA -->\n"+
  "<media>\n"+
    "<led id=\"leds\"/>\n"+
  "</media>\n"+

  "<!-- VISUALIZATION -->\n"+
"<!--\n"+
  "<visualization>\n"+
    "<qt-opengl>\n"+
      "<camera>\n"+
        "<placement idx=\"0\" position=\"  0, 0, 10\" look_at=\"0, 0, 0\" lens_focal_length=\"25\"/>\n"+
        "<placement idx=\"1\" position=\"  0, 0, 10\" look_at=\"0, 0, 0\" lens_focal_length=\"45\"/>\n"+
        "<placement idx=\"2\" position=\"  0, 0, 10\" look_at=\"0, 0, 0\" lens_focal_length=\"120\"/>\n"+
        "<placement idx=\"3\" position=\"-30, 0, 10\" look_at=\"0, 0, 0\" lens_focal_length=\"180\"/>\n"+
        "<placement idx=\"4\" position=\"-30, 0, 10\" look_at=\"0, 0, 0\" lens_focal_length=\"240\"/>\n"+
      "</camera>\n"+
      "<user_functions label=\"iAnt_qt_user_functions\"/>\n"+
    "</qt-opengl>\n"+
  "</visualization> -->\n"+

"</argos-configuration>");
			writer.close();
	}

}
