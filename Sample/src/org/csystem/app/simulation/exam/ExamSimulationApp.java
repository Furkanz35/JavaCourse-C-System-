package org.csystem.app.simulation.exam;

import org.csystem.app.simulation.exam.ExamSimulation;

public class ExamSimulationApp {
 public static void run(){
     ExamSimulation mathSimulation = new ExamSimulation("Matematik");
     mathSimulation.run();
     mathSimulation.printGrade();
     mathSimulation.printReport();


     ExamSimulation chemistrySimulation = new ExamSimulation("Kimya");
     chemistrySimulation.run();
     chemistrySimulation.printGrade();
     chemistrySimulation.printReport();
  }

}
