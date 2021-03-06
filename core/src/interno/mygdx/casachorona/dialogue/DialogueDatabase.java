package interno.mygdx.casachorona.dialogue;

public class DialogueDatabase {

	private static Dialogue[] dialogues = new Dialogue[92];
	
	public static void CreateDialogueDatabase() {
		
		//tentar abrir porta trancada
		Dialogue dialogue = new Dialogue();
		DialogueNode node1 = new DialogueNode("A porta esta trancada.", 0, 1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[0] = dialogue;
		
		//destrancar porta
		dialogue = new Dialogue();
		node1 = new DialogueNode("A porta foi destrancada!", 0, 1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[1] = dialogue;
		
		//item nao funciona
		dialogue = new Dialogue();
		node1 = new DialogueNode("Isso n?o funciona aqui!", 0, 1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[2] = dialogue;
		
		//pegar lanterna
		dialogue = new Dialogue();
		node1 = new DialogueNode("Olha s?, uma lanterna, espero que esteja funcionando.\nTudo aqui t? meio que caindo aos peda?os...", 0, 1);
		DialogueNode node2 = new DialogueNode("Funciona! Com isso, posso enxergar!", 1, 1);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[3] = dialogue;
		
		//interagir novamente com a lanterna
		dialogue = new Dialogue();
		node1 = new DialogueNode("Eu j? peguei a lanterna!\nEla ser? bem ?til!", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[4] = dialogue;
		
		//porta trancada da garagem
		dialogue = new Dialogue();
		node1 = new DialogueNode("A chave est? na porta, mas n?o enxergo nada!", 0, 1);
		node2 = new DialogueNode("Se tivesse uma lanterna, poderia\nver o que estou fazendo.", 1, 1);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[5] = dialogue;
		
		//destranca porta da garagem
		dialogue = new Dialogue();
		node1 = new DialogueNode("Agora consigo abrir!", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[6] = dialogue;
		
		//interage,mas nao pega martelo
		dialogue = new Dialogue();
		node1 = new DialogueNode("Isso ? bem grande. Eu poderia usar para me\nproteger caso tenha algum cara estranho aqui, n??", 0,1);
		node2 = new DialogueNode("Nah, n?o quero levar algo t?o pesado.", 1,1);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[7] = dialogue;
		
		//primeira vez na cena 3
		dialogue = new Dialogue();
		node1 = new DialogueNode("Ah, achei a porta de entrada.", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[8] = dialogue;
		
		//primeira vez na cena 4 - cutscene fanta
		dialogue = new Dialogue();
		node1 = new DialogueNode("!@$!@$HJJK!@$!@K$!@$?!?!?!", 0);
		node2 = new DialogueNode("UM FANTASMA?!?!?!?!?", 1);
		DialogueNode node3 = new DialogueNode("DEUS, POR FAVOR, N?O ME LEVE AINDA!\nEU NUNCA FIZ NADA DE ERRADO!", 2);
		DialogueNode node4 = new DialogueNode("Tipo, quer dizer, eu meio que invadi a casa", 3);
		DialogueNode node5 = new DialogueNode("MAS EU S? QUERIA QUE OS GAROTOS\nGOSTASSEM DE MIM!", 4);
		DialogueNode node6 = new DialogueNode("SENHOR FANTASMA, POR FAVOR,\nN?O LEVE MINHA ALMA!", 5);
		DialogueNode node7 = new DialogueNode("Fantasma: ...?", 6,2);
		DialogueNode node8 = new DialogueNode("Fantasma: S-Se acalme por favor,\nn?o vou fazer nenhum mal ao senhor.", 7,2);
		DialogueNode node9 = new DialogueNode("O FANTASMA FALA?!? MEU DEUS, MEU SENHOR,\nME AJUDA POR FAVOR.", 8);
		DialogueNode node10 = new DialogueNode("Calma, calma, se acalme.", 9);
		DialogueNode node11 = new DialogueNode("Fantasma: Mas eu estou calmo.", 10,2);
		DialogueNode node12 = new DialogueNode("To falando comigo mesmo, fica quieto a?.", 11);
		DialogueNode node13 = new DialogueNode("RESPIRA, inspira, RESPIRA, inspira.", 12);
		DialogueNode node14 = new DialogueNode("Fantasma: Melhor?", 13,2);
		DialogueNode node15 = new DialogueNode("Acho que sim... Ent?o, tu n?o vai me assombrar n?o?", 14);
		DialogueNode node16 = new DialogueNode("Fantasma: ...N?o.", 15,2);
		DialogueNode node17 = new DialogueNode("Opa, ? isso ent?o, vou meter o p?, ja??", 16);
		DialogueNode node18 = new DialogueNode("Fantasma: C-Calma!", 17,2);
		DialogueNode node19 = new DialogueNode("...", 18);
		DialogueNode node20 = new DialogueNode("Fantasma: V-Voc? ? a primeira pessoa que aparece\naqui em muito tempo... voc? poderia me ajudar?", 19,2);
		DialogueNode node21 = new DialogueNode("To com cara de exorcista agora menor?", 20);
		DialogueNode node22 = new DialogueNode("Fantasma: ... Seu comportamento mudou r?pido demais.", 21,2);
		DialogueNode node23 = new DialogueNode("Sou altamente adaptativo, sabe.", 22);
		DialogueNode node24 = new DialogueNode("Fantasma: ...", 23,2);
		DialogueNode node25 = new DialogueNode("Fantasma: Entendo... tudo bem, pode ir,\nvou continuar aqui ent?o...", 24,2);
		DialogueNode node26 = new DialogueNode("Fantasma: Sozinho e no escuro, me perguntando\no porqu? estou preso aqui...", 25,2);
		DialogueNode node27 = new DialogueNode("Fantasma: Talvez daqui a 50 anos algu?m venha me ajudar...", 26,2);
		DialogueNode node28 = new DialogueNode("...", 27);
		DialogueNode node29 = new DialogueNode("Chantagem emocional?", 28);
		DialogueNode node30 = new DialogueNode("Droga, agora eu estou me sentindo mal...", 29);
		DialogueNode node31 = new DialogueNode("Fantasma: Hehe", 30,2);
		DialogueNode node32 = new DialogueNode("\"Hehe\" ? o escambau viu, manda logo o\npapo antes que eu mude de ideia.", 31);
		DialogueNode node33 = new DialogueNode("Fantasma: Ent?o o senhor vai me ajudar?", 32,2);
		DialogueNode node34 = new DialogueNode("Sim sim.", 33);
		DialogueNode node35 = new DialogueNode("Fantasma: Jura?!?", 34,2);
		DialogueNode node36 = new DialogueNode("J? falei que sim.", 35);
		DialogueNode node37 = new DialogueNode("Imagino que quer seguir em frente ou algo assim n??", 36);
		DialogueNode node38 = new DialogueNode("Fantasma: Ah, sim.", 37,2);
		DialogueNode node39 = new DialogueNode("Fantasma: Ent?o, eu n?o sei o que aconteceu comigo,\nmas eu acho que morri.", 38,2);
		DialogueNode node40 = new DialogueNode("Ava. Se n?o tivesse falado eu n?o teria percebido.", 39);
		DialogueNode node41 = new DialogueNode("Morreu do que?", 40);
		DialogueNode node42 = new DialogueNode("Fantasma: N?o sei. Eu eventualmente s? acordei\naqui do nada e j? estava assim.", 41,2);
		DialogueNode node43 = new DialogueNode("...", 42);
		DialogueNode node44 = new DialogueNode("Foda.", 43);
		DialogueNode node45 = new DialogueNode("Bem, seguindo a l?gica dos filmes, voc? deve ter algum\narrependimento ou algo assim...", 44);
		DialogueNode node46 = new DialogueNode("Mas se voc? n?o lembra de nada, talvez seu\narrependimento seja a causa da sua morte?", 45);
		DialogueNode node47 = new DialogueNode("Fantasma: ... talvez...?", 46,2);
		DialogueNode node48 = new DialogueNode("T?, vamo dar um role na casa, vai que a gente\nencontra algo.", 47);
		DialogueNode node49 = new DialogueNode("Fantasma: ... role? Voc? fala de um jeito engra?ado.", 48,2);
		DialogueNode node50 = new DialogueNode("Fantasma: Por sinal, qual o nome do senhor?", 49,2);
		DialogueNode node51 = new DialogueNode("Primeiro, n?o me chama de senhor, fico parecendo\num v?io. Tenho s? 16 anos bele?", 50);
		DialogueNode node52 = new DialogueNode("Meu nome ? Alexander, mas pode me chamar de\nAlek mesmo.", 51);
		DialogueNode node53 = new DialogueNode("Alek: E o seu nome?", 52);
		DialogueNode node54 = new DialogueNode("Fantasma: ... N?o sei", 53,2);
		DialogueNode node55 = new DialogueNode("Alek: ...", 54);
		DialogueNode node56 = new DialogueNode("Alek: Ok, eu sou bom em dar nome ?s coisas.", 55);
		DialogueNode node57 = new DialogueNode("Alek: Seu nome agora ?... Fanta. Porque voc? ? um\nfantasma e tals.", 56);
		DialogueNode node58 = new DialogueNode("Fanta: ...", 57,2);
		DialogueNode node59 = new DialogueNode("Fanta: Isso n?o ? nome de refrigerante?", 58,2);
		DialogueNode node60 = new DialogueNode("Alek: Calado.", 59);
		node60.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		dialogue.addDialogueNode(node7);
		dialogue.addDialogueNode(node8);
		dialogue.addDialogueNode(node9);
		dialogue.addDialogueNode(node10);
		dialogue.addDialogueNode(node11);
		dialogue.addDialogueNode(node12);
		dialogue.addDialogueNode(node13);
		dialogue.addDialogueNode(node14);
		dialogue.addDialogueNode(node15);
		dialogue.addDialogueNode(node16);
		dialogue.addDialogueNode(node17);
		dialogue.addDialogueNode(node18);
		dialogue.addDialogueNode(node19);
		dialogue.addDialogueNode(node20);
		dialogue.addDialogueNode(node21);
		dialogue.addDialogueNode(node22);
		dialogue.addDialogueNode(node23);
		dialogue.addDialogueNode(node24);
		dialogue.addDialogueNode(node25);
		dialogue.addDialogueNode(node26);
		dialogue.addDialogueNode(node27);
		dialogue.addDialogueNode(node28);
		dialogue.addDialogueNode(node29);
		dialogue.addDialogueNode(node30);
		dialogue.addDialogueNode(node31);
		dialogue.addDialogueNode(node32);
		dialogue.addDialogueNode(node33);
		dialogue.addDialogueNode(node34);
		dialogue.addDialogueNode(node35);
		dialogue.addDialogueNode(node36);
		dialogue.addDialogueNode(node37);
		dialogue.addDialogueNode(node38);
		dialogue.addDialogueNode(node39);
		dialogue.addDialogueNode(node40);
		dialogue.addDialogueNode(node41);
		dialogue.addDialogueNode(node42);
		dialogue.addDialogueNode(node43);
		dialogue.addDialogueNode(node44);
		dialogue.addDialogueNode(node45);
		dialogue.addDialogueNode(node46);
		dialogue.addDialogueNode(node47);
		dialogue.addDialogueNode(node48);
		dialogue.addDialogueNode(node49);
		dialogue.addDialogueNode(node50);
		dialogue.addDialogueNode(node51);
		dialogue.addDialogueNode(node52);
		dialogue.addDialogueNode(node53);
		dialogue.addDialogueNode(node54);
		dialogue.addDialogueNode(node55);
		dialogue.addDialogueNode(node56);
		dialogue.addDialogueNode(node57);
		dialogue.addDialogueNode(node58);
		dialogue.addDialogueNode(node59);
		dialogue.addDialogueNode(node60);
		DialogueDatabase.dialogues[9] = dialogue;
		
		//primeira vez na cena 5
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Voc? ? meio pequeno, ser? que voc? ? uma\ncrian?a?", 0);
		node2 = new DialogueNode("Fanta: Acho que sim.", 1,2);
		node3 = new DialogueNode("Alek: Poxa. Deve ser uma merda morrer cedo e\ndepois ficar preso em um lugar assim.", 2);
		node4 = new DialogueNode("Fanta: ...", 3,2);
		node5 = new DialogueNode("Alek: N?o se preocupa maninho, prometi que ia\nte ajudar, n?o ??", 4);
		node6 = new DialogueNode("Fanta: ... Sim... Obrigado.", 5,2);
		node6.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		DialogueDatabase.dialogues[10] = dialogue;
		
		//primeira vez na cena 6
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Uou...", 0);
		node2 = new DialogueNode("Alek: Sabe, n?o sou muito de acreditar nessas coisas,\nmas a atmosfera desse lugar ? meio... pesada.", 1);
		node3 = new DialogueNode("Fanta: ... Sim, eu n?o gosto de ficar aqui.", 2,2);
		node4 = new DialogueNode("Fanta: Eu me sinto... sufocado.", 3,2);
		node5 = new DialogueNode("Alek: N?o precisa se esfor?ar muito cara, eu posso dar\numa olhada aqui sozinho.", 4);
		node6 = new DialogueNode("Fanta: N?o. Est? tudo bem, eu aguento.", 5,2);
		node6.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		DialogueDatabase.dialogues[11] = dialogue;
		
		//primera vez na cena 7
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Aqui tem cara de suite principal.", 0);
		node2 = new DialogueNode("Alek: Seus pais deveriam dormir aqui.", 1);
		node3 = new DialogueNode("Fanta: ?, talvez.", 2,2);
		node3.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		DialogueDatabase.dialogues[12] = dialogue;
		
		//primeira vez na cena 8
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Aqui ? menos assustador do que eu pensei.", 0);
		node2 = new DialogueNode("Alek: Quando eu entrei o tempo estava meio fechado, mas\nagora at? que est? um p?r do sol bonito", 1);
		node3 = new DialogueNode("Fanta: ...", 2,2);
		node4 = new DialogueNode("Alek: Tudo bem irm?o?", 3);
		node5 = new DialogueNode("Fanta: Aqui. Tem algo aqui. Eu consigo sentir.", 4,2);
		node6 = new DialogueNode("Alek: Parece que chegamos na fase final ent?o. Vamos\nresolver isso logo.", 5);
		node6.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		DialogueDatabase.dialogues[13] = dialogue;
		
		//primeira vez na cena 9
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Ok, isso definitivamente ? o quarto de uma crian?a,\nent?o deve ser o seu quarto.", 0);
		node2 = new DialogueNode("Fanta: Bem, aqui ? o lugar que eu me sinto mais confort?vel.", 1,2);
		node3 = new DialogueNode("Alek: Vamos dar uma aten??o especial aqui ent?o.", 2);
		node4 = new DialogueNode("Alek: Aposto que vamos descobrir algo se mexermos\nem tudo aqui.", 3);
		node4.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		DialogueDatabase.dialogues[14] = dialogue;
		
		//pegando a chave do escritorio, na cena 7
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Bem, n?o vi sinais de que tenha algu?m aqui dentro,\nessas bebidas espalhadas pela casa s?o dos antigos moradores ent?o?", 0);
		node2 = new DialogueNode("Fanta: ...", 1,2);
		node3 = new DialogueNode("Fanta: Acho que lembro de algu?m bebendo muito e\nfalando alto.", 2,2);
		node4 = new DialogueNode("Alek: Vou dar uma olhada nas gavetas tamb?m.\nVai que acho algo.", 3);
		node5 = new DialogueNode("Alek: Uma chave!, ser? que ? do quarto da sala?", 4);
		node6 = new DialogueNode("Fanta: ?... parece que sim.", 5,2);
		node6.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		DialogueDatabase.dialogues[15] = dialogue;
		
		//mexendo na comoda, tendo a chave, na cena 7
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Bem, n?o vi sinais de que tenha algu?m aqui dentro,\nessas bebidas espalhadas pela casa s?o dos antigos moradores ent?o?", 0);
		node2 = new DialogueNode("Fanta: ...", 1,2);
		node3 = new DialogueNode("Fanta: Acho que lembro de algu?m bebendo muito e\nfalando alto.", 2,2);
		node3.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		DialogueDatabase.dialogues[16] = dialogue;
		
		//cena 9 cama
		
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: AAAAAA eu sempre quis uma cama assim quando era\npequeno, pena que era cara.", 0);
		node2 = new DialogueNode("Fanta: Ela ? muito confort?vel, deita a?.", 1,2);
		node3 = new DialogueNode("Alek: Opa, ok.", 2);
		node4 = new DialogueNode("*Pula de cara na cama*", 3);
		node5 = new DialogueNode("Alek: /@?!@?E$/??", 4);
		node6 = new DialogueNode("*sai da cama*", 5);
		node7 = new DialogueNode("Alek: *cof* *cof*", 6);
		node8 = new DialogueNode("Alek: QUE ISSO? Cama toda dura, cheia de poeira,\nestou sentindo algo dentro da minha roupa!", 7);
		node9 = new DialogueNode("Alek:  VOC? DISSE QUE ERA CONFORT?VEL!", 8);
		node10 = new DialogueNode("Fanta: HEHEHEHEHEHEHE", 9,2);
		node11 = new DialogueNode("Fanta: Como eu ia saber se era ou n?o?\nEu sou um fantasma.", 10,2);
		node12 = new DialogueNode("Alek: T? cheio das piadoca agora hein.", 11);
		node13 = new DialogueNode("Fanta: Mas... Ela realmente era confort?vel.\nEu me sentia t?o bem nela...", 12,2);
		node14 = new DialogueNode("Fanta: Lembro que algu?m me contava hist?rias toda\nnoite... Para onde essa pessoa foi?", 13,2);
		node15 = new DialogueNode("Alek: ... Tudo bem amiguinho?", 14);
		node16 = new DialogueNode("Fanta: Sim. Est? tudo bem.", 15,2);
		node16.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		dialogue.addDialogueNode(node7);
		dialogue.addDialogueNode(node8);
		dialogue.addDialogueNode(node9);
		dialogue.addDialogueNode(node10);
		dialogue.addDialogueNode(node11);
		dialogue.addDialogueNode(node12);
		dialogue.addDialogueNode(node13);
		dialogue.addDialogueNode(node14);
		dialogue.addDialogueNode(node15);
		dialogue.addDialogueNode(node16);
		DialogueDatabase.dialogues[17] = dialogue;
		
		//cena 9 tenda
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Mas que diabos ? isso? Gente rica\n? esquisita demais.", 0);
		node2 = new DialogueNode("Fanta: ? minha tenda, era super divertido\nbrincar aqui!", 1,2);
		node3 = new DialogueNode("Alek: Era?", 2);
		node4 = new DialogueNode("Fanta: SIM! Eu lembro que era um dos meus\nesconderijos favoritos, quando eu ficava aqui, a mam?-", 3,2);
		node5 = new DialogueNode("Fanta: ...", 4,2);
		node6 = new DialogueNode("Fanta: M-Minha cabe?a d?i. Eu estava quase\nme lembrando... Por que...?", 5,2);
		node7 = new DialogueNode("Alek: Calma calma, fica tranquilo, a gente\ntem tempo, vamos lembrar de tudo, ok?", 6);
		node8 = new DialogueNode("Fanta: ... Ok.", 7,2);
		node8.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		dialogue.addDialogueNode(node7);
		dialogue.addDialogueNode(node8);
		DialogueDatabase.dialogues[18] = dialogue;
		
		//cena 9 poster
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: .. S?rio, sem coment?rios.", 0);
		node2 = new DialogueNode("Fanta: Voc? gosta de criticar minhas\ncoisas n??", 1,2);
		node3 = new DialogueNode("Alek: Claro, m? gosto merda.", 2);
		node4 = new DialogueNode("Fanta: ...", 3,2);
		node5 = new DialogueNode("Fanta: Ele foi um presente... um presente\nque eu gostei muito... era... meu anivers?rio?", 4,2);
		node6 = new DialogueNode("Alek: Sei n?o bro, quem daria essa coisa\nbizarra para uma crian?a? Seloko.", 5);
		node7 = new DialogueNode("Alek: Lembra da data pelo menos?", 6);
		node8 = new DialogueNode("Fanta: N?o...", 7,2);
		node8.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		dialogue.addDialogueNode(node7);
		dialogue.addDialogueNode(node8);
		DialogueDatabase.dialogues[19] = dialogue;
		
		//cena 9 bau
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Espero que tenha loot dentro.", 0);
		node2 = new DialogueNode("Alek: Se bem que do jeito que essa casa ?\nbizarra, capaz de ter um esqueleto aqui.", 1);
		node3 = new DialogueNode("*abre*", 2);
		node4 = new DialogueNode("Alek: Muitas coisas. Figurinhas, bonecos de a??o,\ncarrinhos, pi?o. Voc? era uma crian?a feliz pelo visto.", 3);
		node5 = new DialogueNode("Fanta: Sim, eu lembro que brincava bastante aqui.\nMas isso ? estranho, lembro de um ba?, mas n?o era esse.", 4,2);
		node6 = new DialogueNode("Alek: Por que acha isso?", 5);
		node7 = new DialogueNode("Fanta: Eu lembro que ele era maior, grande a ponto de\neu conseguir deitar dentro dele se me espremesse um pouquinho.", 6,2);
		node8 = new DialogueNode("Alek: Por que voc? entraria em um ba? meu fi?", 7);
		node9 = new DialogueNode("Fanta: Para brincar com o papai.", 8,2);
		node10 = new DialogueNode("Fanta: Pa-Papai", 9,2);
		node11 = new DialogueNode("Alek: Ei ei ei, que foi, voc? come?ou\na chorar mais que o normal!", 10);
		node12 = new DialogueNode("Fanta: T-T? t-tudo b-bem... E-Eu s-s?\np-preciso d-descansar u-um p-pouco.", 11,2);
		node12.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		dialogue.addDialogueNode(node7);
		dialogue.addDialogueNode(node8);
		dialogue.addDialogueNode(node9);
		dialogue.addDialogueNode(node10);
		dialogue.addDialogueNode(node11);
		dialogue.addDialogueNode(node12);
		DialogueDatabase.dialogues[20] = dialogue;
		
		//cena 9 recebe senha
		dialogue = new Dialogue();
		node1 = new DialogueNode("Fanta: Eu consigo lembrar agora.", 0,2);
		node2 = new DialogueNode("Fanta: Eu realmente vivia aqui com meu pai e\nminha m?e, essa era a nossa casa.", 1,2);
		node3 = new DialogueNode("Fanta: A gente era muito feliz, nos divertimos\nmuito todo dia.", 2,2);
		node4 = new DialogueNode("Fanta: Lembro que o Papai trabalhava bastante e\na Mam?e ficava aqui em casa todos os dias comigo.", 3,2);
		node5 = new DialogueNode("Fanta: Mas eventualmente algo mudou...", 4,2);
		node6 = new DialogueNode("Alek: O que?", 5);
		node7 = new DialogueNode("Fanta: N?o sei direito ainda.", 6,2);
		node8 = new DialogueNode("Alek: Tudo bem, n?s vamos descobrir logo.\nLembra de mais alguma coisa importante?", 7);
		node9 = new DialogueNode("Fanta: ...", 8,2);
		node10 = new DialogueNode("Fanta: Meu anivers?rio. 15/03/1985", 9,2);
		node11 = new DialogueNode("Alek: ... Faz realmente muito tempo que tudo aconteceu ent?o.", 10);
		node12 = new DialogueNode("Alek: Bem, se eles eram pais t?o bons assim,\nessa pode ser a senha de algo. Vou anotar aqui.", 11);
		node13 = new DialogueNode("Fanta: Sim, provavelmente.", 12,2);
		node13.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		dialogue.addDialogueNode(node7);
		dialogue.addDialogueNode(node8);
		dialogue.addDialogueNode(node9);
		dialogue.addDialogueNode(node10);
		dialogue.addDialogueNode(node11);
		dialogue.addDialogueNode(node12);
		dialogue.addDialogueNode(node13);
		DialogueDatabase.dialogues[21] = dialogue;
		
		//cena6 cofre sem senha
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Um cofre... Esse ? um modelo bem antigo.\nNa casa dos meus av?s tem um desse.", 0);
		node2 = new DialogueNode("Alek: A senha deve ter 4 d?gitos.", 1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[22] = dialogue;
		
		//cena6 cofre abre
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Abriu! Vamos ver o que tem ai...", 0);
		node2 = new DialogueNode("Alek: A chave! Deve ser do sot?o", 1);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[23] = dialogue;
		
		//cena6 cofre vazio
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: N?o tem mais nada de valor a?.", 0);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[24] = dialogue;
		
		//cena8 bau sem marreta
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Um ba?... trancado...", 0);
		node2 = new DialogueNode("Alek: Eu n?o vou achar outra chave.\nT? na hora da marreta!", 1);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[25] = dialogue;
		
		//cena 1 pega marreta
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Isso vai servir!", 0);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[26] = dialogue;
		
		//ja pegou marreta
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: T? pesado! Vamos logo com isso!", 0);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[27] = dialogue;
		
		//intro0
		dialogue = new Dialogue();
		node1 = new DialogueNode("Eu n?o deveria ter ca?do no papo daqueles caras...", 0);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[28] = dialogue;
		
		//intro1
		dialogue = new Dialogue();
		node1 = new DialogueNode("Garoto Forte: Voc? sabia que h? uma casa\nassombrada aqui no bairro?", 0);
		node2 = new DialogueNode("Garoto de bon?: Acho que n?o n?, voc? se\nmudou a pouco tempo.", 1);
		node3 = new DialogueNode("Garoto alto: Vamos fazer o seguinte, se voc?\nentrar na casa e destrancar a porta da frente para n?s...", 2);
		node4 = new DialogueNode("...vamos considerar te colocar no nosso time\nde basquete, novato.", 3);
		node4.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		DialogueDatabase.dialogues[29] = dialogue;
		
		//intro2
		dialogue = new Dialogue();
		node1 = new DialogueNode("Ent?o...Eu s? tenho de entrar pela garagem e\ndar um jeito de abrir a porta da frente...?", 0);
		node2 = new DialogueNode("Garoto alto: Isso mesmo.", 1);
		node3 = new DialogueNode("...", 2);
		node4 = new DialogueNode("Ok.", 3);
		node5 = new DialogueNode("Garoto alto: Boa sorte novato.", 4);
		node5.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		DialogueDatabase.dialogues[30] = dialogue;

		//cutscene porta
		dialogue = new Dialogue();
		node1 = new DialogueNode("Cara, a porta t? trancada, eu preciso de uma chave", 0);
		node2 = new DialogueNode("O que ? isso, algum tipo de jogo de explora??o?", 1);
		node3 = new DialogueNode("...", 2);
		node4 = new DialogueNode("N?o consigo ver os garotos pela janela...", 3);
		node5 = new DialogueNode("Bem, eles devem estar me esperando em outro lugar.", 4);
		node5.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		DialogueDatabase.dialogues[31] = dialogue;
		
		//martelo na porta da frente
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: At? que isso funciona aqui...", 0);
		node2 = new DialogueNode("Talvez mais tarde...", 1);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[32] = dialogue;
		
		//ending1
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: CHEGA DE PUZZLE!", 0);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[33] = dialogue;
		
		//ending2
		dialogue = new Dialogue();
		node1 = new DialogueNode("...", 0);
		node2 = new DialogueNode("Alek: Fanta... esse ?... voc?...?", 1);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[34] = dialogue;
		
		//ending3
		dialogue = new Dialogue();
		node1 = new DialogueNode("Ah sim... Agora eu lembrei como foi.", 0, 2);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[35] = dialogue;
		
		//ending4
		dialogue = new Dialogue();
		node1 = new DialogueNode("Eu vivia com meu pai e minha m?e.\nN?s ?ramos felizes.", 0,2);
		node2 = new DialogueNode("Mam?e cuidava dos meus estudos e da casa e o Papai\ntrabalhava muito o dia todo.", 1,2);
		node3 = new DialogueNode("Mas acho que as coisas eventualmente n?o estavam\ndando t?o certo para o papai.", 2,2);
		node3.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		DialogueDatabase.dialogues[36] = dialogue;
		
		//ending5
		dialogue = new Dialogue(); 
		node1 = new DialogueNode("Ele ficava nervoso frequentemente e come?ou a\nbeber muito.", 0,2);
		node2 = new DialogueNode("As coisas em casa come?aram a mudar,\npapai e mam?e discutiam o dia todo.", 1,2);
		node3 = new DialogueNode("Eu n?o entendia o porqu?, mas eles n?o paravam de brigar.", 2,2);
		node3.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		DialogueDatabase.dialogues[37] = dialogue;
		
		//ending6
		dialogue = new Dialogue(); 
		node1 = new DialogueNode("Um dia ele chegou b?bado em casa tarde da noite.", 0,2);
		node2 = new DialogueNode("Quando a m?e foi question?-lo sobre isso,\nele a agrediu.", 1,2);
		node3 = new DialogueNode("Ele estava completamente diferente,\naquele n?o era meu pai.", 2,2);
		node4 = new DialogueNode("Quando eu gritei para ele parar, ele come?ou a\nvir em minha dire??o.", 3,2);
		node4.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		DialogueDatabase.dialogues[38] = dialogue;
		
		//ending7 
		dialogue = new Dialogue();
		node1 = new DialogueNode("Mam?e tentou me defender, mas ele n?o parou.", 0, 2);
		node2 = new DialogueNode("Lembro que ele agarrou meu bra?o com for?a,\nainda consigo sentir aquele cheiro horr?vel vindo dele.", 1,2);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[39] = dialogue;
		
		//ending8
		dialogue = new Dialogue();
		node1 = new DialogueNode("Eu n?o lembro exatamente o que ele falou para mim\nnaquele dia.", 0, 2);
		node2 = new DialogueNode(" Acho que ? melhor assim.", 1,2);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[40] = dialogue;
		
		//ending9
		dialogue = new Dialogue();
		node1 = new DialogueNode("Mam?e acertou a cabe?a dele com uma garrafa,\ne isso o fez cair.", 0, 2);
		node2 = new DialogueNode("Ela me pegou e tentou fugir, mas eu sabia que ele\nia vir atr?s de n?s, ent?o eu precisava ser corajoso.", 1,2);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[41] = dialogue;
		
		//ending10
		dialogue = new Dialogue();
		node1 = new DialogueNode("Eu tranquei a porta, peguei a chave e me\nescondi no lugar mais seguro poss?vel.", 0, 2);
		node2 = new DialogueNode("Um lugar que eu sabia que s? meu pai me acharia.", 1,2);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[42] = dialogue;
		
		//ending11
		dialogue = new Dialogue();
		node1 = new DialogueNode("Eu ouvia ele me procurando e gritando\ncoisas horr?veis, mas estava tudo bem... ", 0,2);
		node2 = new DialogueNode("Aquele n?o era meu pai. O tempo ia passar\ne meu pai voltaria, ele tinha de voltar.", 1,2);
		node3 = new DialogueNode("Eu aguardei pacientemente at? o barulho parar.", 2,2);
		node4 = new DialogueNode("Quando tudo ficou quieto, eu tentei sair,\nmas eu n?o consegui.", 3,2);
		node5 = new DialogueNode("Mas estava tudo bem, papai iria chegar\nde manh? e me tiraria dali.", 4,2);
		node6 = new DialogueNode("Estava tudo bem... era s?... esperar...", 5,2);
		node6.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		DialogueDatabase.dialogues[43] = dialogue;
		
		//ending12
		dialogue = new Dialogue();
		node1 = new DialogueNode("...", 0);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[44] = dialogue;
		
		//ending13
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Ei, voc? parou de chorar", 0);
		node2 = new DialogueNode("Fanta: Sim. Est? tudo bem agora.", 1,2);
		node3 = new DialogueNode("Fanta: Mas eu queria saber o que aconteceu\ncom minha m?e...", 2, 2);
		node4 = new DialogueNode("Alek: N?o se preocupe.\nEu prometo que vou descobrir.", 3);
		node4.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		DialogueDatabase.dialogues[45] = dialogue;
		
		//ending14
		dialogue = new Dialogue();
		node1 = new DialogueNode("Fanta: Eu sei que vai.", 0, 2);
		node2 = new DialogueNode("Fanta: Obrigado por tudo.", 1,2);
		node3 = new DialogueNode("Fanta: Se n?o fosse por voc?, eu n?o\nsei mais quanto tempo eu ficaria aqui.", 2, 2);
		node4 = new DialogueNode("Alek: Que isso po, tamo junto.", 3);
		node4.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		DialogueDatabase.dialogues[46] = dialogue;
		
		//ending15
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: E-Ei, o que s?o essas luzinhas?", 0,1);
		node2 = new DialogueNode("Fanta: Hehe, acho que minha hora chegou.", 1,2);
		node3 = new DialogueNode("Alek: Espera! A gente nem teve a\nchance de jogar algo juntos!", 2,1);
		node4 = new DialogueNode("Fanta: N?o se preocupe com isso,\neu estou bem agora. De verdade", 3,2);
		node5 = new DialogueNode("Fanta: Quando voc? chegou, tinha dito que entrou aqui para\nfazer com que algumas pessoas gostassem de voc?.", 4,2);
		node6 = new DialogueNode("Fanta: Eu n?o sei se essas pessoas s?o\nt?o legais assim, mas eu gosto de voc?.", 5,2);
		node7 = new DialogueNode("Fanta: Voc? ? incr?vel, sei que n?o precisa\nse esfor?ar tanto para fazer amizades.", 6,2);
		node8 = new DialogueNode("Fanta: S? seja voc? mesmo e as pessoas v?o gostar.", 7,2);
		node8.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		dialogue.addDialogueNode(node7);
		dialogue.addDialogueNode(node8);
		DialogueDatabase.dialogues[47] = dialogue;
		
		//ending16
		dialogue = new Dialogue(); 
		node1 = new DialogueNode("Alek: ...", 0);
		node2 = new DialogueNode("Fanta: Vamos, n?o fa?a essa cara.", 1,2);
		node3 = new DialogueNode("Fanta: Sabe, se eu tivesse um irm?o mais velho,\neu gostaria que ele fosse como voc?...", 2,2);
		node3.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		DialogueDatabase.dialogues[48] = dialogue;
		
		//ending17
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: ...", 0,1);
		node2 = new DialogueNode("Alek: At? algum dia, maninho.", 1,1);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[49] = dialogue;
		
		//ending18
		dialogue = new Dialogue();
		node1 = new DialogueNode("Fim", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[50] = dialogue;
		
		//bicicleta cena1
		dialogue = new Dialogue();
		node1 = new DialogueNode("Essa bicicleta ? realmente BEM antiga, aposto que\nela se desmonta se eu tentasse subir.", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[51] = dialogue;
		
		//teia cena1
		dialogue = new Dialogue();
		node1 = new DialogueNode("Argh, aranhas...", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[52] = dialogue;
		
		//garrafas cena1
		dialogue = new Dialogue();
		node1 = new DialogueNode("?lcool", 0,1);
		node2 = new DialogueNode("Pode ser perigoso se tiver algum morador de rua\naqui dentro. Tenho de tomar cuidado.", 1,1);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[53] = dialogue;
		
		//brinquedos cena1
		dialogue = new Dialogue();
		node1 = new DialogueNode("Isso aqui ? beeem... Feio. N?o tem outra palavra,\ns? muito feio.", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[54] = dialogue;
		
		//bola cena1
		dialogue = new Dialogue();
		node1 = new DialogueNode("Aaaa cara uma bola! Uma pena que esteja meio murcha...\nQue saudades de jogar basquete com o pessoal...", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[55] = dialogue;
		
		//bicicleta com fanta cena1
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Acha que essa bike era sua?", 0,1);
		node2 = new DialogueNode("Fanta: N?o sei. Mas acho que n?o consigo andar nela agora.", 1, 2);
		node3 = new DialogueNode("Alek: Ava", 2,1);
		node3.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		DialogueDatabase.dialogues[56] = dialogue;
		
		//brinquedos com fanta cena1
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Sabe o que s?o essas coisas feias aqui?", 0,1);
		node2 = new DialogueNode("Fanta: Ei! Eu acho fofo.", 1, 2);
		node3 = new DialogueNode("Alek: Aham, ? sim po.", 2,1);
		node3.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		DialogueDatabase.dialogues[57] = dialogue;
		
		//marreta com fanta cena1
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Acho que o jeito mais f?cil de abrir as portas\n? usando essa marreta heim.", 0,1);
		node2 = new DialogueNode("Fanta: Como se voc? conseguisse levantar essa marreta\ncom esses bracinhos n?.", 1,2);
		node3 = new DialogueNode("Alek: ...", 2,1);
		node4 = new DialogueNode("Alek: Co?.", 3,1);
		node4.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		DialogueDatabase.dialogues[58] = dialogue;
		
		//pia cena2
		dialogue = new Dialogue();
		node1 = new DialogueNode("Nossa, isso aqui t? um nojo viu!", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[59] = dialogue;
		
		//fogao cena2
		dialogue = new Dialogue();
		node1 = new DialogueNode("Cuidado Alek, voc? n?o quer estragar seu t?nis novo\npor causa desse vidro no ch?o.", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[60] = dialogue;
		
		//pano cena2
		dialogue = new Dialogue();
		node1 = new DialogueNode("AAAAA QUE FOFO.", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[61] = dialogue;
		
		//geladeira cena2
		dialogue = new Dialogue();
		node1 = new DialogueNode("Oooo de casa, ser? que tem algo para comer aqui?", 0,1);
		node2 = new DialogueNode("...Ok, isso t? muito nojento.", 1,1);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[62] = dialogue;
		
		//relogio cena2
		dialogue = new Dialogue();
		node1 = new DialogueNode("Odeio rel?gio anal?gico... ", 0,1);
		node2 = new DialogueNode("Parado exatamente ?s 3, seria da manh? ou da tarde?", 1,1);
		node3 = new DialogueNode("Se for da manh?, significa que a casa ? assombrada?", 2,1);
		node3.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		DialogueDatabase.dialogues[63] = dialogue;
		
		//pia com fanta cena2
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: nossa, isso aqui t? um nojo viu.", 0,1);
		node2 = new DialogueNode("Fanta: Esperava o que? N?o tenho m?o para limpar as coisas.", 1,2);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[64] = dialogue;
		
		//geladeira com fanta cena2
		dialogue = new Dialogue();
		node1 = new DialogueNode("Fanta: Voc? n?o vai achar nada para comer a?, nem pense nisso.", 0,2);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[65] = dialogue;
		
		//relogio com fanta cena2
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Parou em 3am, sabia que estava assombrada.", 0,1);
		node2 = new DialogueNode("Fanta: Tenho quase certeza que n?o parou em 3 horas.", 1,2);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[66] = dialogue;
		
		//pano cena2
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Olha que fofo!", 0,1);
		node2 = new DialogueNode("Fanta: ...", 1,2);
		node3 = new DialogueNode("Fanta: Eu j? tinha visto isso, eu meio que estou preso aqui.", 2,2);
		node4 = new DialogueNode("Alek: Ah ?.", 3,1);
		node5 = new DialogueNode("Fanta: Mas voc? falou com tanto entusiasmo.\nVoc? deve gostar de gato n??", 4,2);
		node6 = new DialogueNode("Alek: ... Algum problema com isso?", 5,1);
		node7 = new DialogueNode("Fanta: N?o. Hehehe", 6,2);
		node8 = new DialogueNode("Alek: ...", 7,1);
		node8.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		dialogue.addDialogueNode(node7);
		dialogue.addDialogueNode(node8);
		DialogueDatabase.dialogues[67] = dialogue;
		
		//teia cena4
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: J? estou come?ando a ficar assustado com\no tamanho dessas teias.", 0,1);
		node2 = new DialogueNode("Fanta: Tem medo de aranha, mas n?o tem medo de\nfantasma, vai entender.", 1,2);
		node3 = new DialogueNode("Alek: Ei! N?o tenho medo delas, s? n?o quero que\nelas cheguem muito perto.", 2,1);
		node3.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		DialogueDatabase.dialogues[68] = dialogue;
		
		//foto chao cena4
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Tem vidro em todo canto aqui, n?o aguento\nmais. N?o morra Jordan, n?o morra.", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[69] = dialogue;
		
		//sofa cena4
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Minha rinite ataca s? de eu olhar para isso.", 0,1);
		node2 = new DialogueNode("Fanta: Entendo.", 1,2);
		node3 = new DialogueNode("Alek: Entende como? Tu nem tem nariz.", 2,1);
		node4 = new DialogueNode("Fanta: Ah! Pois ?.", 3,2);
		node4.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		DialogueDatabase.dialogues[70] = dialogue;
		
		//bebida cena4
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Algu?m realmente tem um problema s?rio com ?lcool...\nIsso me lembra do meu velho.", 0,1);
		node2 = new DialogueNode("Fanta: Est? tudo bem?", 1,2);
		node3 = new DialogueNode("Alek: Claro, claro, s? algumas lembran?as ruins.", 2,1);
		node3.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		DialogueDatabase.dialogues[71] = dialogue;
		
		//jogo cena4
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Que diabos de jogo ? esse?", 0,1);
		node2 = new DialogueNode("Fanta: ...", 1,2);
		node3 = new DialogueNode("Fanta: Ah ?!", 2,2);
		node4 = new DialogueNode("Fanta: Era um jogo de estrat?gia muito divertido!\nLembro que precisava de v?rias pessoas para jogar.", 3,2);
		node5 = new DialogueNode("Fanta: Mas... Com quem eu jogava?", 4,2);
		node6 = new DialogueNode("Alek: Com seus pa?s, talvez?", 5,1);
		node7 = new DialogueNode("Fanta: ... acho que pode ser.", 6,2);
		node7.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		dialogue.addDialogueNode(node7);
		DialogueDatabase.dialogues[72] = dialogue;
		
		//foto parede cena4
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Devem ser os antigos donos da casa. Uma mulher,\num homem e uma crian?a, fofinhos at?.", 0,1);
		node2 = new DialogueNode("Alek: Pera. Pera pera pera.", 1,1);
		node3 = new DialogueNode("Alek: Ei Fanta, acha que esse pode ser voc? e seus pa?s???", 2,1);
		node4 = new DialogueNode("Fanta: ... N?o sei. Eu j? encarei essa foto por muito\ntempo, mas n?o sinto nada olhando para ela.", 3,2);
		node5 = new DialogueNode("Alek: Entendo. Bem, se esse for voc? mesmo, voc? era\nbem fofinho. Seus pais eram bonitos tamb?m.", 4,1);
		node6 = new DialogueNode("Fanta: Valeu, eu acho...", 5,2);
		node6.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		DialogueDatabase.dialogues[73] = dialogue;
		
		//mesa cena4
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: O que diabos rolou com essa mesa?\nPessoal estava jogando Uno ??", 0,1);
		node2 = new DialogueNode("Fanta: Uno?", 1,2);
		node3 = new DialogueNode("Alek: Vou te explicar o que ? n?o.", 2,1);
		node3.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		DialogueDatabase.dialogues[74] = dialogue;
		
		//foto parede cena 5
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Definitivamente s?o os donos da casa. N?o sei explicar,\nmas eles parecem estranhos.", 0,1);
		node2 = new DialogueNode("Alek: Bem, essa casa ? gigante. Gente rica costuma ser estranha.", 1,1);
		node3 = new DialogueNode("Fanta: Se eles forem meus pais mesmo, eu vou\nficar ofendido com o que voc? disse.", 2,2);
		node4 = new DialogueNode("Alek: Fica mec a?, falei na moral.", 3,1);
		node5 = new DialogueNode("Alek: Mas me pergunto onde eles est?o agora...\nN?o ? normal uma casa dessas ficar desocupada.", 4,1);
		node6 = new DialogueNode("Alek: agora que parei para pensar, essa mulher me lembra algu?m...", 5,1);
		node6.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		DialogueDatabase.dialogues[75] = dialogue;
		
		//vidro cena 5
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Juro que se meu Jordan estragar\neu vou botar fogo nessa casa", 0,1);
		node2 = new DialogueNode("Fanta: Voc? se preocupa demais com esse t?nis.\n? s? um t?nis!", 1,2);
		node3 = new DialogueNode("Alek: EI! isso ? um J-O-R-D-A-N, voc? n?o tem ideia do qu?o\nincr?vel e importante ele ?!", 2,1);
		node4 = new DialogueNode("Alek: Mas irei te explicar, tudo come?ou em 1985 quand-", 3,1);
		node5 = new DialogueNode("Fanta: Chega, eu n?o ligo.", 4, 2);
		node5.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		DialogueDatabase.dialogues[76] = dialogue;
		
		//aranha cena 5
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Finalmente achei a culpada por todas essas Teias!", 0,1);
		node2 = new DialogueNode("Alek: Bem, voc? ? grande e assustador, mas tem bem, ? meio fofo at?.\nA partir de agora, voc? se chama Douglas.", 1,1);
		node3 = new DialogueNode("Fanta: ...", 2,2);
		node4 = new DialogueNode("Alek: Que?", 3,1);
		node5 = new DialogueNode("Fanta: Nada... S? estou admirando sua capacidade de dar nomes...", 4,2);
		node6 = new DialogueNode("Alek: Sinto que voc? est? me julgando, mas vou ignorar.", 5,1);
		node6.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		DialogueDatabase.dialogues[77] = dialogue;
		
		//sotao trancado 5
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Bro, sem chance de eu entrar a?.\nM? coisa de filme de terror.", 0,1);
		node2 = new DialogueNode("Fanta: Voc? est? literalmente na presen?a de um fantasma", 1,2);
		node3 = new DialogueNode("Alek: Voc? ? irrelevante, o problema ? ter algo pior ali.\nFaz o seguinte, d? uma olhada l? sozinho, ok?", 2,1);
		node4 = new DialogueNode("Fanta ... n?o posso. Eu simplesmente n?o consigo entrar nesse lugar.", 3,2);
		node5 = new DialogueNode("Alek: ... Ora pois. Ent?o parece que o lugar mais\nimportante ? o mais assustador.", 4,1);
		node6 = new DialogueNode("Alek: Pelo visto a gente vai precisar de uma chave\npara abrir isso.", 5,1);
		node7 = new DialogueNode("Fanta: Cofre.", 6,2);
		node8 = new DialogueNode("Alek: Que?", 7,1);
		node9 = new DialogueNode("Fanta: Eu consigo lembrar vagamente que as chaves da casa costumavam\nficar em um cofre... Mas n?o sei onde ele est?.", 8,2);
		node9.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		dialogue.addDialogueNode(node5);
		dialogue.addDialogueNode(node6);
		dialogue.addDialogueNode(node7);
		dialogue.addDialogueNode(node8);
		dialogue.addDialogueNode(node9);
		DialogueDatabase.dialogues[78] = dialogue;
		
		//porta que nao abre cena 5
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Essa aqui n?o abre.", 0,1);
		node2 = new DialogueNode("Fanta: E nem vai abrir.", 1,2);
		node3 = new DialogueNode("Alek: Acho que vou s? aceitar isso.", 2,1);
		node3.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		DialogueDatabase.dialogues[79] = dialogue;
		
		//cama cena 7
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Aqui deve ser o quarto do casal.\nA cama t? nojenta!", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[80] = dialogue;
		
		//armario cena 7
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: U?, tem bastante roupa aqui.\nO pessoal se mudou sem pegar nada?", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[81] = dialogue;
		
		//raiz cena 7
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Bro, vegeta??o brasileira ? meio agressiva demais.", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[82] = dialogue;
		
		//anjo cena6
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Hmmm, n?o reconhe?o, deve ser um desenho aleat?rio.", 0,1);
		node2 = new DialogueNode("Fanta: Vai ver eu que pintei quando estava vivo?", 1,2);
		node3 = new DialogueNode("Alek: Vai que, n?.", 2,1);
		node3.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		DialogueDatabase.dialogues[83] = dialogue;
		
		//pixel cena6
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: MEU DEUS! ESSA ? A INCR?VEL OBRA DE NOTCH,\nHUMANO AO CUBO?!?!?", 0,1);
		node2 = new DialogueNode("Eu amo essa pintura, adoro como ela retrata bem\nnossa realidade", 1,1);
		node3 = new DialogueNode("Fanta: Nem ideia do que voc? est? falando.", 2,2);
		node4 = new DialogueNode("Alek: Calado, voc? n?o sabe apreciar a arte.", 3,1);
		node4.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		dialogue.addDialogueNode(node3);
		dialogue.addDialogueNode(node4);
		DialogueDatabase.dialogues[84] = dialogue;
		
		//cadeira cena6
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Oloko, uma cadeira Gamer... Quero!", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[85] = dialogue;
		
		//mesa cena6
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Muitos n?meros... N?o entendo muita coisa, mas tem\nmuito vermelho nesse papel, n?o deve ser algo bom.", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[86] = dialogue;
		
		//estante cena6
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Hmmm, \"Como ser um g?nio\", \"Como ficar rico em 5 passos\",\n\"Economia avan?ada para pessoas avan?adas\", \"A arte da guerra\"...", 0,1);
		node2 = new DialogueNode("Parece tudo meio chato nessa casa.", 1,1);
		node2.setEnd();
		dialogue.addDialogueNode(node1);
		dialogue.addDialogueNode(node2);
		DialogueDatabase.dialogues[87] = dialogue;
		
		//teia cena8
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Eai Douglas, desculpa invadir seu lugar assim,\nprometo que vou sair o mais r?pido poss?vel.", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[88] = dialogue;
		
		//janela cena8
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: O p?r do Sol est? bem bonito.", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[89] = dialogue;
		
		//roupa cena8
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Essas roupas me lembram alguma coisa.", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[90] = dialogue;
		
		//caixa cena8
		dialogue = new Dialogue();
		node1 = new DialogueNode("Alek: Bem, tudo na casa est? bagun?ado. Era de se esperar que isso estivesse\ntamb?m, mas o n?vel de p? aqui t? surreal. A? minha rinite.", 0,1);
		node1.setEnd();
		dialogue.addDialogueNode(node1);
		DialogueDatabase.dialogues[91] = dialogue;
	}
	
	public static Dialogue getDialogue(int id) {
		return DialogueDatabase.dialogues[id];
	}
}