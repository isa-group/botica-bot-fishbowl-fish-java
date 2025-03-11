package es.us.isa.botica.fishbowl.fish;

import es.us.isa.botica.bot.BotLauncher;

public class FishBotBootstrap {
  public static void main(String[] args) {
    BotLauncher.run(new FishBot(), args);
  }
}
