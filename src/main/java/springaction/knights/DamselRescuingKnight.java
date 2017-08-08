package springaction.knights;

/**
 * Created by kelvin on 17/8/1.
 */
public class DamselRescuingKnight implements Knight {
    private RescueDamselQuest quest;
    public DamselRescuingKnight() {
        this.quest = new RescueDamselQuest();
    }
    public void embarkOnQuest(){
        quest.embark();
    }
}
