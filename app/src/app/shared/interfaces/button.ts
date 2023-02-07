export interface Button {
    title: string;
    tooltip?: string;
    icon: string;
    showIcon: boolean;
    showTitle: boolean;
    type: string;
    class?: string;
    func: Function;
    params:  Array<string>;
}
