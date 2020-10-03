import { Description } from './description';
import { GameElement } from './gameElement';
import { RequirementCombination } from './requirementCombination';

export class Quest extends GameElement {

	type: string; // enum
	maxTrys: number;
	maxTime: Date; //mm:ss
	displayImageFirst: boolean;
	requirementCombination: RequirementCombination;
	help: Array<Description>;

  getElement(solution: number): GameElement {
    return this.requirementCombination.combinationMap[solution];
  }
}
