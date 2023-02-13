export interface Link {
    label: string;
    url: string;
    icon?: string;
    external?: boolean;
    size?: string,
    target?: '_self'|'_blank';
    visible: boolean;
}
